package com.compiler.shop.ast.core;

public abstract class RootNode extends AstNode {
    protected RootNode(String nodeType, int lineNumber) {
        super(nodeType, lineNumber);
    }
}
