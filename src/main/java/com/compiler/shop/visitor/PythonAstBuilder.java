package com.compiler.shop.visitor;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.ast.python.*;
import com.compiler.shop.generated.PythonSubsetBaseVisitor;
import com.compiler.shop.generated.PythonSubsetParser;

public class PythonAstBuilder extends PythonSubsetBaseVisitor<AstNode> {

    @Override
    public AstNode visitProgram(PythonSubsetParser.ProgramContext ctx) {
        int line = ctx.start != null ? ctx.start.getLine() : 1;
        PyProgramNode root = new PyProgramNode(line);

        for (var st : ctx.statement()) {
            AstNode child = visit(st);
            if (child != null) root.addChild(child);
        }
        return root;
    }

    @Override
    public AstNode visitStatement(PythonSubsetParser.StatementContext ctx) {
        if (ctx.simpleStatement() != null) return visit(ctx.simpleStatement());
        return null; // NEWLINE-only statements
    }

    @Override
    public AstNode visitSimpleStatement(PythonSubsetParser.SimpleStatementContext ctx) {
        if (ctx.assignment() != null) return visit(ctx.assignment());
        if (ctx.commandStmt() != null) return visit(ctx.commandStmt());
        if (ctx.exprStmt() != null) return visit(ctx.exprStmt());
        return null;
    }

    @Override
    public AstNode visitAssignment(PythonSubsetParser.AssignmentContext ctx) {
        int line = ctx.start.getLine();
        PyAssignNode node = new PyAssignNode(line, ctx.IDENTIFIER().getText());
        node.addChild(visit(ctx.expr()));
        return node;
    }

    @Override
    public AstNode visitExprStmt(PythonSubsetParser.ExprStmtContext ctx) {
        if (ctx.funcCall() != null) return visit(ctx.funcCall());
        return visit(ctx.expr());
    }

    @Override
    public AstNode visitCommandStmt(PythonSubsetParser.CommandStmtContext ctx) {
        int line = ctx.start.getLine();

        PyCommandNode.CommandType type;
        if (ctx.ADD_PRODUCT() != null) type = PyCommandNode.CommandType.ADD_PRODUCT;
        else if (ctx.GET_PRODUCTS() != null) type = PyCommandNode.CommandType.GET_PRODUCTS;
        else if (ctx.GET_PRODUCT_DETAILS() != null) type = PyCommandNode.CommandType.GET_PRODUCT_DETAILS;
        else type = PyCommandNode.CommandType.DELETE_PRODUCT;

        PyCommandNode node = new PyCommandNode(line, type);

        // add_product(args...)
        if (ctx.argList() != null) {
            for (var e : ctx.argList().expr()) {
                node.addChild(visit(e));
            }
        }

        // get_product_details(expr) or delete_product(expr) (depending on your grammar version)
        if (ctx.expr() != null && ctx.argList() == null) {
            node.addChild(visit(ctx.expr()));
        }

        return node;
    }

    @Override
    public AstNode visitFuncCall(PythonSubsetParser.FuncCallContext ctx) {
        int line = ctx.start.getLine();
        PyFuncCallNode call = new PyFuncCallNode(line, ctx.IDENTIFIER().getText());

        if (ctx.argList() != null) {
            for (var e : ctx.argList().expr()) {
                call.addChild(visit(e));
            }
        }
        return call;
    }

    @Override
    public AstNode visitExpr(PythonSubsetParser.ExprContext ctx) {
        // depending on your python grammar (expr may include literal/IDENTIFIER/funcCall)
        if (ctx.literal() != null) return visit(ctx.literal());
        if (ctx.IDENTIFIER() != null) return new PyIdentifierNode(ctx.start.getLine(), ctx.IDENTIFIER().getText());
        if (ctx.funcCall() != null) return visit(ctx.funcCall());
        return null;
    }

    @Override
    public AstNode visitLiteral(PythonSubsetParser.LiteralContext ctx) {
        int line = ctx.start.getLine();
        if (ctx.NUMBER() != null) {
            return new PyNumberNode(line, Double.parseDouble(ctx.NUMBER().getText()));
        }
        return new PyStringNode(line, AstUtil.stripQuotes(ctx.STRING().getText()));
    }
}
