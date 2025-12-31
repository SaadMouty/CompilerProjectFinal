package com.compiler.shop.visitor;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.ast.css.*;
import com.compiler.shop.generated.CssSubsetBaseVisitor;
import com.compiler.shop.generated.CssSubsetParser;

import java.util.List;

public class CssAstBuilder extends CssSubsetBaseVisitor<AstNode> {

    @Override
    public AstNode visitStylesheet(CssSubsetParser.StylesheetContext ctx) {
        CssStylesheetNode root =
                new CssStylesheetNode(ctx.start != null ? ctx.start.getLine() : 1);

        // ✅ Robust: don't rely on ctx.rule()
        List<CssSubsetParser.RuleContext> rules =
                ctx.getRuleContexts(CssSubsetParser.RuleContext.class);

        for (CssSubsetParser.RuleContext r : rules) {
            AstNode node = visit(r);
            if (node != null) root.addChild(node);
        }
        return root;
    }

    @Override
    public AstNode visitRule(CssSubsetParser.RuleContext ctx) {
        CssRuleNode rule = new CssRuleNode(ctx.start.getLine());

        // selectors
        for (var s : ctx.selectorGroup().selector()) {
            rule.addChild(new CssSelectorNode(s.start.getLine(), s.getText()));
        }

        // declarations
        for (var d : ctx.declaration()) {
            AstNode decl = visit(d);
            if (decl != null) rule.addChild(decl);
        }
        return rule;
    }

    @Override
    public AstNode visitDeclaration(CssSubsetParser.DeclarationContext ctx) {
        String property = ctx.IDENT().getText();
        String value = ctx.value().getText();
        return new CssDeclarationNode(ctx.start.getLine(), property, value);
    }
}
