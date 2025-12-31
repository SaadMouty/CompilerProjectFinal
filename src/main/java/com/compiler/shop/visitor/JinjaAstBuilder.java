package com.compiler.shop.visitor;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.ast.jinja.*;
import com.compiler.shop.generated.JinjaSubsetBaseVisitor;
import com.compiler.shop.generated.JinjaSubsetParser;

public class JinjaAstBuilder extends JinjaSubsetBaseVisitor<AstNode> {

    @Override
    public AstNode visitTemplate(JinjaSubsetParser.TemplateContext ctx) {
        int line = ctx.start != null ? ctx.start.getLine() : 1;
        JinjaTemplateNode root = new JinjaTemplateNode(line);

        for (var p : ctx.part()) {
            AstNode node = visit(p);
            if (node != null) root.addChild(node);
        }
        return root;
    }

    @Override
    public AstNode visitPart(JinjaSubsetParser.PartContext ctx) {
        if (ctx.TEXT() != null) {
            return new JinjaTextNode(ctx.TEXT().getSymbol().getLine(), ctx.TEXT().getText());
        }
        if (ctx.printExpr() != null) return visit(ctx.printExpr());
        if (ctx.forBlock() != null) return visit(ctx.forBlock());
        if (ctx.ifBlock() != null) return visit(ctx.ifBlock());
        return null;
    }

    @Override
    public AstNode visitPrintExpr(JinjaSubsetParser.PrintExprContext ctx) {
        int line = ctx.start.getLine();
        JinjaPrintNode node = new JinjaPrintNode(line);
        node.addChild(visit(ctx.expr()));
        return node;
    }

    @Override
    public AstNode visitForBlock(JinjaSubsetParser.ForBlockContext ctx) {
        int line = ctx.start.getLine();
        String var = ctx.IDENTIFIER().getText();

        JinjaForNode node = new JinjaForNode(line, var);

        // iterable expr
        node.addChild(visit(ctx.expr()));

        // body parts
        for (var p : ctx.part()) {
            AstNode child = visit(p);
            if (child != null) node.addChild(child);
        }
        return node;
    }

    @Override
    public AstNode visitIfBlock(JinjaSubsetParser.IfBlockContext ctx) {
        int line = ctx.start.getLine();
        JinjaIfNode node = new JinjaIfNode(line);

        // condition
        node.addChild(visit(ctx.expr()));

        for (var p : ctx.part()) {
            AstNode child = visit(p);
            if (child != null) node.addChild(child);
        }
        return node;
    }

    // ---- Expression handling (subset): variables and literals only ----

    @Override
    public AstNode visitExpr(JinjaSubsetParser.ExprContext ctx) {
        // if your grammar has orExpr/andExpr... you can expand later
        // but with single-mode grammar we used before, expr starts at orExpr.
        return visitChildren(ctx);
    }

    @Override
    public AstNode visitVariable(JinjaSubsetParser.VariableContext ctx) {
        int line = ctx.start.getLine();
        return new JinjaVarNode(line, ctx.getText()); // e.g. item.href
    }

    @Override
    public AstNode visitLiteral(JinjaSubsetParser.LiteralContext ctx) {
        int line = ctx.start.getLine();
        if (ctx.STRING() != null) return new JinjaStringNode(line, AstUtil.stripQuotes(ctx.STRING().getText()));
        if (ctx.NUMBER() != null) return new JinjaNumberNode(line, Double.parseDouble(ctx.NUMBER().getText()));
        if (ctx.TRUE() != null) return new JinjaBoolNode(line, true);
        return new JinjaBoolNode(line, false);
    }
}
