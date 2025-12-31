package com.compiler.shop.ast.jinja;

import com.compiler.shop.ast.core.ValueNode;

public class JinjaStringNode extends ValueNode {
    public JinjaStringNode(int lineNumber, String value) {
        super("JinjaString", lineNumber, value);
    }
}
