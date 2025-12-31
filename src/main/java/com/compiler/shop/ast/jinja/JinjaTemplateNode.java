package com.compiler.shop.ast.jinja;

import com.compiler.shop.ast.core.RootNode;

public class JinjaTemplateNode extends RootNode {
    public JinjaTemplateNode(int lineNumber) {
        super("JinjaTemplate", lineNumber);
    }
}
