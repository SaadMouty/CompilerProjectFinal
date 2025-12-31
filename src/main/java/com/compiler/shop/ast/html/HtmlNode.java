package com.compiler.shop.ast.html;

import com.compiler.shop.ast.core.AstNode;

public abstract class HtmlNode extends AstNode {
    protected HtmlNode(String type, int lineNumber) {
        super(type, lineNumber);
    }
}
