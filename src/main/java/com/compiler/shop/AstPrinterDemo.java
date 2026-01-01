package com.compiler.shop;

import com.compiler.shop.ast.core.AstNode;
import com.compiler.shop.generated.*;
import com.compiler.shop.printer.AstPrinter;
import com.compiler.shop.visitor.PythonAstBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class AstPrinterDemo {

    public static void main(String[] args) {
        String py = """
                add_product("img.png", "Phone", 999.99, "Nice phone")
                get_products()
                """;

        AstNode ast = buildPythonAst(py);

        AstPrinter printer = new AstPrinter();
        System.out.println(printer.print(ast));
    }

    private static AstNode buildPythonAst(String src) {
        CharStream input = CharStreams.fromString(src);
        PythonSubsetLexer lexer = new PythonSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonSubsetParser parser = new PythonSubsetParser(tokens);

        ParseTree tree = parser.program();
        return new PythonAstBuilder().visit(tree);
    }
}
