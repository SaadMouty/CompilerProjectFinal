package com.compiler.shop.ast.python;

public class PyStringNode extends PyExprNode {
    private final String value;

    public PyStringNode(int lineNumber, String value) {
        super("PyString", lineNumber);
        this.value = value;
    }

    public String getText() {
        return value;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + value + ")";
    }
}
