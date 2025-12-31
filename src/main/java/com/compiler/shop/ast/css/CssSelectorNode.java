package com.compiler.shop.ast.css;

public class CssSelectorNode extends CssNode {
    private final String selectorText;

    public CssSelectorNode(int lineNumber, String selectorText) {
        super("CssSelector", lineNumber);
        this.selectorText = selectorText;
    }

    public String getSelectorText() {
        return selectorText;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + selectorText + ")";
    }
}
