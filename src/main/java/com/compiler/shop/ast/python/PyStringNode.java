package com.compiler.shop.ast.python;

import com.compiler.shop.ast.core.ValueNode;

public class PyStringNode extends ValueNode {
    public PyStringNode(int lineNumber, String value) {
        super("PyString", lineNumber, value);
    }

    public String getText() {
        return (String) getValue();
    }
}
