package com.compiler.shop.ast.jinja;

import com.compiler.shop.ast.core.ValueNode;

public class JinjaBoolNode extends ValueNode {
    public JinjaBoolNode(int lineNumber, boolean value) {
        super("JinjaBool", lineNumber, value);
    }
}
