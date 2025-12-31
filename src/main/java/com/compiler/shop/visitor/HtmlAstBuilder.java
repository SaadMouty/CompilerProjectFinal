package com.compiler.shop.visitor;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.ast.html.*;
import com.compiler.shop.generated.HtmlSubsetBaseVisitor;
import com.compiler.shop.generated.HtmlSubsetParser;

public class HtmlAstBuilder extends HtmlSubsetBaseVisitor<AstNode> {

    @Override
    public AstNode visitDocument(HtmlSubsetParser.DocumentContext ctx) {
        HtmlDocumentNode root = new HtmlDocumentNode(ctx.start != null ? ctx.start.getLine() : 1);
        for (var n : ctx.node()) {
            AstNode child = visit(n);
            if (child != null) root.addChild(child);
        }
        return root;
    }

    @Override
    public AstNode visitNode(HtmlSubsetParser.NodeContext ctx) {
        if (ctx.element() != null) return visit(ctx.element());
        if (ctx.TEXT() != null) return new HtmlTextNode(ctx.TEXT().getSymbol().getLine(), ctx.TEXT().getText());
        return null;
    }

    @Override
    public AstNode visitEmptyElement(HtmlSubsetParser.EmptyElementContext ctx) {
        HtmlElementNode el = new HtmlElementNode(ctx.start.getLine(), ctx.NAME().getText(), true);
        for (var a : ctx.attribute()) {
            el.addAttribute((HtmlAttributeNode) visit(a));
        }
        return el;
    }

    @Override
    public AstNode visitNormalElement(HtmlSubsetParser.NormalElementContext ctx) {
        String tag = ctx.startTag().NAME().getText();
        HtmlElementNode el = new HtmlElementNode(ctx.start.getLine(), tag, false);

        for (var a : ctx.startTag().attribute()) {
            el.addAttribute((HtmlAttributeNode) visit(a));
        }

        for (var n : ctx.node()) {
            AstNode child = visit(n);
            if (child != null) el.addChild(child);
        }
        return el;
    }

    @Override
    public AstNode visitAttribute(HtmlSubsetParser.AttributeContext ctx) {
        String name = ctx.NAME().getText();
        String value = null;
        if (ctx.attrValue() != null) {
            if (ctx.attrValue().STRING() != null) value = AstUtil.stripQuotes(ctx.attrValue().STRING().getText());
            else value = ctx.attrValue().NAME().getText();
        }
        return new HtmlAttributeNode(ctx.start.getLine(), name, value);
    }
}
