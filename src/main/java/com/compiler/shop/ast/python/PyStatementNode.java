package com.compiler.shop.ast.python;

import com.compiler.shop.ast.core.AstNode;

public abstract class PyStatementNode extends AstNode {
    protected PyStatementNode(String type, int lineNumber) {
        super(type, lineNumber);
    }
}
