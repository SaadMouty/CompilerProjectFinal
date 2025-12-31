package com.compiler.shop.ast.jinja;

public class JinjaTextNode extends JinjaNode {
    private final String text;

    public JinjaTextNode(int lineNumber, String text) {
        super("JinjaText", lineNumber);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String label() {
        return getNodeType() + "(len=" + (text == null ? 0 : text.length()) + ")";
    }
}
