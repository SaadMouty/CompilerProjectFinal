package com.compiler.shop.ast.html;

public class HtmlTextNode extends HtmlNode {
    private final String text;

    public HtmlTextNode(int lineNumber, String text) {
        super("HtmlText", lineNumber);
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
