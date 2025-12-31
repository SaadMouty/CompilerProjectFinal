package com.compiler.shop.ast.css;

import com.compiler.shop.ast.core.RootNode;

public class CssStylesheetNode extends RootNode {
    public CssStylesheetNode(int lineNumber) {
        super("CssStylesheet", lineNumber);
    }
}
