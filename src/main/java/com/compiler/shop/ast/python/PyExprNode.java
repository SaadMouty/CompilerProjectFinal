package com.compiler.shop.ast.python;

import com.compiler.shop.ast.core.AstNode;

public abstract class PyExprNode extends AstNode {
    protected PyExprNode(String type, int lineNumber) {
        super(type, lineNumber);
    }
}
