package com.compiler.shop.ast.html;

import com.compiler.shop.ast.core.RootNode;

public class HtmlDocumentNode extends RootNode {
    public HtmlDocumentNode(int lineNumber) {
        super("HtmlDocument", lineNumber);
    }
}
