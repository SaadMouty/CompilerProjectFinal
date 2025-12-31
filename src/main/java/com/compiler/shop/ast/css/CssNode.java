package com.compiler.shop.ast.css;

import com.compiler.shop.ast.core.AstNode;

public abstract class CssNode extends AstNode {
    protected CssNode(String type, int lineNumber) {
        super(type, lineNumber);
    }
}
