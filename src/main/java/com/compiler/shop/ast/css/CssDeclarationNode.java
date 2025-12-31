package com.compiler.shop.ast.css;

public class CssDeclarationNode extends CssNode {
    private final String property;
    private final String value;

    public CssDeclarationNode(int lineNumber, String property, String value) {
        super("CssDeclaration", lineNumber);
        this.property = property;
        this.value = value;
    }

    public String getProperty() { return property; }
    public String getValue() { return value; }

    @Override
    public String label() {
        return getNodeType() + "(" + property + ": " + value + ")";
    }
}
