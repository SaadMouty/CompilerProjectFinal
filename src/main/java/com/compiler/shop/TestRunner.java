package com.compiler.shop;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.generated.*;
import com.compiler.shop.visitor.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class TestRunner {

    public static void main(String[] args) {
        System.out.println("=== STEP 1-4 SANITY CHECK ===");

        testPython();
        testJinja();
        testHtml();
        testCss();

        System.out.println("=== ALL DONE ✅ ===");
    }

    private static void testPython() {
        String src = """
                add_product("img.png", "Phone", 999.99, "Nice phone")
                get_products()
                """;

        AstNode ast = buildPythonAst(src);
        System.out.println("[Python] AST: " + ast.label() + " | children=" + ast.getChildren().size());
    }

    private static AstNode buildPythonAst(String src) {
        CharStream input = CharStreams.fromString(src);
        PythonSubsetLexer lexer = new PythonSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonSubsetParser parser = new PythonSubsetParser(tokens);

        // fail fast on syntax errors
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        ParseTree tree = parser.program();
        return new PythonAstBuilder().visit(tree);
    }

    private static void testJinja() {
        String src = """
                <ul>
                {% for item in navigation %}
                  <li><a href="{{ item.href }}">{{ item.caption }}</a></li>
                {% endfor %}
                </ul>
                """;

        AstNode ast = buildJinjaAst(src);
        System.out.println("[Jinja] AST: " + ast.label() + " | children=" + ast.getChildren().size());
    }

    private static AstNode buildJinjaAst(String src) {
        CharStream input = CharStreams.fromString(src);
        JinjaSubsetLexer lexer = new JinjaSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JinjaSubsetParser parser = new JinjaSubsetParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        ParseTree tree = parser.template();
        return new JinjaAstBuilder().visit(tree);
    }

    private static void testHtml() {
        String src = """
                <div class="box">
                  <h1>Hello</h1>
                  <img src="x.png"/>
                </div>
                """;

        AstNode ast = buildHtmlAst(src);
        System.out.println("[HTML]  AST: " + ast.label() + " | children=" + ast.getChildren().size());
    }

    private static AstNode buildHtmlAst(String src) {
        CharStream input = CharStreams.fromString(src);
        HtmlSubsetLexer lexer = new HtmlSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HtmlSubsetParser parser = new HtmlSubsetParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        ParseTree tree = parser.document();
        return new HtmlAstBuilder().visit(tree);
    }

    private static void testCss() {
        String src = """
                body { font-size: 16px; margin: 0; }
                .card { padding: 12px; border: 1px solid #ccc; }
                """;

        AstNode ast = buildCssAst(src);
        System.out.println("[CSS]   AST: " + ast.label() + " | children=" + ast.getChildren().size());
    }

    private static AstNode buildCssAst(String src) {
        CharStream input = CharStreams.fromString(src);
        CssSubsetLexer lexer = new CssSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CssSubsetParser parser = new CssSubsetParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        ParseTree tree = parser.stylesheet();
        return new CssAstBuilder().visit(tree);
    }
}
