package com.compiler.shop.interpreter;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.ast.python.*;
import com.compiler.shop.symbols.Product;
import com.compiler.shop.symbols.SymbolTable;
import com.compiler.shop.symbols.VariableValue;

import java.util.List;

public class PythonInterpreter {
    private String valueAsString(PyExprNode e) {
        VariableValue v = evalExprToValue(e);
        if (v.getType() != VariableValue.Type.STRING)
            throw new RuntimeError(e.getLineNumber(), "Expected STRING");
        return v.asString();
    }

    private double valueAsNumber(PyExprNode e) {
        VariableValue v = evalExprToValue(e);
        if (v.getType() != VariableValue.Type.NUMBER)
            throw new RuntimeError(e.getLineNumber(), "Expected NUMBER");
        return v.asNumber();
    }

    private final SymbolTable symbols;
    private PythonResult lastResult = PythonResult.none();

    public PythonInterpreter(SymbolTable symbols) {
        this.symbols = symbols;
    }

    public PythonResult getLastResult() {
        return lastResult;
    }

    /** Execute a full Python program AST */
    public void execute(PyProgramNode program) {
        for (AstNode st : program.getChildren()) {
            if (st instanceof PyStatementNode stmt) {
                executeStatement(stmt);
            }
        }
    }

    private void executeStatement(PyStatementNode stmt) {
        if (stmt instanceof PyAssignNode assign) {
            execAssign(assign);
            lastResult = PythonResult.none();
            return;
        }

        if (stmt instanceof PyCommandNode cmd) {
            lastResult = execCommand(cmd);
            return;
        }

        // If you later add more statement types:
        throw new RuntimeError(stmt.getLineNumber(), "Unsupported statement: " + stmt.getClass().getSimpleName());
    }

    private void execAssign(PyAssignNode assign) {
        String name = assign.getIdentifier();
        if (assign.getChildren().isEmpty()) {
            throw new RuntimeError(assign.getLineNumber(), "Assignment missing RHS");
        }

        VariableValue value = evalExprToValue((PyExprNode) assign.getChildren().get(0));

        // add in current scope if not exists, otherwise update nearest scope
        if (symbols.existsVar(name)) symbols.updateVar(name, value);
        else symbols.addVar(name, value);
    }

    private PythonResult execCommand(PyCommandNode cmd) {
        return switch (cmd.getCommandType()) {
            case ADD_PRODUCT -> execAddProduct(cmd);
            case GET_PRODUCTS -> execGetProducts(cmd);
            case GET_PRODUCT_DETAILS -> execGetProductDetails(cmd);
            case DELETE_PRODUCT -> execDeleteProduct(cmd);
        };
    }

    private PythonResult execAddProduct(PyCommandNode cmd) {
        // args: image, name, price, details
        if (cmd.getChildren().size() != 4) {
            throw new RuntimeError(cmd.getLineNumber(), "add_product requires 4 args: image,name,price,details");
        }

        String image = requireString(cmd, 0);
        String name = requireString(cmd, 1);
        double price = requireNumber(cmd, 2);
        String details = requireString(cmd, 3);

        String id = symbols.addProduct(image, name, price, details);
        return PythonResult.productId(id);
    }

    private PythonResult execGetProducts(PyCommandNode cmd) {
        if (!cmd.getChildren().isEmpty()) {
            throw new RuntimeError(cmd.getLineNumber(), "get_products takes no args");
        }
        List<Product> products = symbols.getProducts();
        return PythonResult.products(products);
    }

    private PythonResult execGetProductDetails(PyCommandNode cmd) {
        if (cmd.getChildren().size() != 1) {
            throw new RuntimeError(cmd.getLineNumber(), "get_product_details requires 1 arg: id_or_name");
        }

        String key = requireStringLike(cmd, 0);
        Product p = findByIdOrName(cmd.getLineNumber(), key);
        return PythonResult.product(p);
    }

    private PythonResult execDeleteProduct(PyCommandNode cmd) {
        if (cmd.getChildren().size() != 1) {
            throw new RuntimeError(cmd.getLineNumber(), "delete_product requires 1 arg: id_or_name");
        }

        String key = requireStringLike(cmd, 0);
        Product p = findByIdOrName(cmd.getLineNumber(), key);
        symbols.removeProductById(p.getId());
        return PythonResult.none();
    }

    /** Accepts either an ID (UUID) or a product name. */
    private Product findByIdOrName(int line, String key) {
        // try as id
        if (symbols.existsProductById(key)) {
            return symbols.findProductById(key);
        }

        // fallback: search by name
        for (Product p : symbols.getProducts()) {
            if (p.getName().equals(key)) return p;
        }

        throw new RuntimeError(line, "Product not found by id or name: " + key);
    }

    /* ================= Expression evaluation ================= */

    private VariableValue evalExprToValue(PyExprNode expr) {
        if (expr instanceof PyStringNode s) return VariableValue.ofString(s.getText());
        if (expr instanceof PyNumberNode n) return VariableValue.ofNumber(n.getNumber());
        if (expr instanceof PyIdentifierNode id) return symbols.findVar(id.getName());

        if (expr instanceof PyFuncCallNode call) {
            String fn = call.getFunctionName();

            // built-ins: add_product(...) returns id (string)
            if (fn.equals("add_product")) {
                if (call.getChildren().size() != 4)
                    throw new RuntimeError(expr.getLineNumber(), "add_product requires 4 args");

                String image = valueAsString((PyExprNode) call.getChildren().get(0));
                String name  = valueAsString((PyExprNode) call.getChildren().get(1));
                double price = valueAsNumber((PyExprNode) call.getChildren().get(2));
                String details = valueAsString((PyExprNode) call.getChildren().get(3));

                String id = symbols.addProduct(image, name, price, details);
                return VariableValue.ofString(id);
            }

            throw new RuntimeError(expr.getLineNumber(), "Unknown function: " + fn);
        }


        throw new RuntimeError(expr.getLineNumber(), "Unsupported expression: " + expr.getClass().getSimpleName());
    }

    private String requireString(PyCommandNode cmd, int index) {
        VariableValue v = evalExprToValue((PyExprNode) cmd.getChildren().get(index));
        if (v.getType() != VariableValue.Type.STRING) {
            throw new RuntimeError(cmd.getLineNumber(), "Arg " + (index + 1) + " must be STRING");
        }
        return v.asString();
    }

    private double requireNumber(PyCommandNode cmd, int index) {
        VariableValue v = evalExprToValue((PyExprNode) cmd.getChildren().get(index));
        if (v.getType() != VariableValue.Type.NUMBER) {
            throw new RuntimeError(cmd.getLineNumber(), "Arg " + (index + 1) + " must be NUMBER");
        }
        return v.asNumber();
    }

    /** Accept STRING literal or identifier that resolves to STRING. */
    private String requireStringLike(PyCommandNode cmd, int index) {
        VariableValue v = evalExprToValue((PyExprNode) cmd.getChildren().get(index));
        if (v.getType() == VariableValue.Type.STRING) return v.asString();
        throw new RuntimeError(cmd.getLineNumber(), "Arg " + (index + 1) + " must be STRING (id or name)");
    }
}
