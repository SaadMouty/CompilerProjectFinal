package com.compiler.shop.ast.python;

public class PyNumberNode extends PyExprNode {
    private final double value;

    public PyNumberNode(int lineNumber, double value) {
        super("PyNumber", lineNumber);
        this.value = value;
    }

    public double getNumber() {
        return value;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + value + ")";
    }
}
