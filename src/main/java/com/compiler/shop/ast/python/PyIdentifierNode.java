package com.compiler.shop.ast.python;

public class PyIdentifierNode extends PyExprNode {
    private final String name;

    public PyIdentifierNode(int lineNumber, String name) {
        super("PyIdentifier", lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + name + ")";
    }
}
