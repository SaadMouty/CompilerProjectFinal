package com.compiler.shop.ast.jinja;

import com.compiler.shop.ast.core.ValueNode;

public class JinjaNumberNode extends ValueNode {
    public JinjaNumberNode(int lineNumber, double value) {
        super("JinjaNumber", lineNumber, value);
    }
}
