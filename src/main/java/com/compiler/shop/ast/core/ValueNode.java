package com.compiler.shop.ast.core;

import java.util.Objects;

public abstract class ValueNode extends AstNode {
    private final Object value;

    protected ValueNode(String nodeType, int lineNumber, Object value) {
        super(nodeType, lineNumber);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + Objects.toString(value) + ")";
    }
}
