package com.compiler.shop.ast.html;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElementNode extends HtmlNode {
    private final String tagName;
    private final List<HtmlAttributeNode> attributes = new ArrayList<>();
    private final boolean selfClosing;

    public HtmlElementNode(int lineNumber, String tagName, boolean selfClosing) {
        super("HtmlElement", lineNumber);
        this.tagName = tagName;
        this.selfClosing = selfClosing;
    }

    public String getTagName() { return tagName; }
    public boolean isSelfClosing() { return selfClosing; }

    public List<HtmlAttributeNode> getAttributes() {
        return Collections.unmodifiableList(attributes);
    }

    public void addAttribute(HtmlAttributeNode attr) {
        if (attr != null) attributes.add(attr);
    }

    @Override
    public String label() {
        return getNodeType() + "(" + tagName + (selfClosing ? "/>" : ">") + ")";
    }
}
