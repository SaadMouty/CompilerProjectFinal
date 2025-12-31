package com.compiler.shop.ast.html;

public class HtmlAttributeNode extends HtmlNode {
    private final String name;
    private final String value; // can be null for boolean attrs

    public HtmlAttributeNode(int lineNumber, String name, String value) {
        super("HtmlAttribute", lineNumber);
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public String getValue() { return value; }

    @Override
    public String label() {
        return value == null ? getNodeType() + "(" + name + ")" : getNodeType() + "(" + name + "=" + value + ")";
    }
}
