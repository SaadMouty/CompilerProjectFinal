package com.compiler.shop;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.ast.python.PyProgramNode;
import com.compiler.shop.generated.*;
import com.compiler.shop.interpreter.PythonInterpreter;
import com.compiler.shop.printer.AstPrinter;
import com.compiler.shop.symbols.SymbolTable;
import com.compiler.shop.visitor.PythonAstBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class PythonInterpreterDemo {

    public static void main(String[] args) {
        String program = """
                pid = add_product("img.png", "Phone", 999.99, "Nice phone")
                add_product("img2.png", "Laptop", 1499.0, "Powerful laptop")
                get_products()
                get_product_details("Phone")
                delete_product("Laptop")
                get_products()
                """;

        PyProgramNode ast = (PyProgramNode) buildPythonAst(program);

        // (حسب ملاحظات الدكتور) عرض AST
        System.out.println("=== AST ===");
        System.out.println(new AstPrinter().print(ast));

        // تفسير البرنامج وبناء SymbolTable
        SymbolTable st = new SymbolTable();
        PythonInterpreter interp = new PythonInterpreter(st);
        interp.execute(ast);

        System.out.println("=== VARIABLES (dump) ===");
        System.out.println(st.dumpVariables());

        System.out.println("=== PRODUCTS ===");
        System.out.println(st.getProducts());

        System.out.println("=== LAST RESULT ===");
        System.out.println(interp.getLastResult());
    }

    private static AstNode buildPythonAst(String src) {
        CharStream input = CharStreams.fromString(src);
        PythonSubsetLexer lexer = new PythonSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonSubsetParser parser = new PythonSubsetParser(tokens);

        ParseTree tree = parser.program();
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new RuntimeException("Parse error at " + line + ":" + charPositionInLine + " " + msg);
            }
        });


        return new PythonAstBuilder().visit(tree);
    }
}
