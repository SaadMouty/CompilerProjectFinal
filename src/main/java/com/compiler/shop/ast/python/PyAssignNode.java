package com.compiler.shop.ast.python;

public class PyAssignNode extends PyStatementNode {
    private final String identifier;

    public PyAssignNode(int lineNumber, String identifier) {
        super("PyAssign", lineNumber);
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + identifier + ")";
    }
}
