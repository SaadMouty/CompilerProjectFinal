package com.compiler.shop.ast.python;

import com.compiler.shop.ast.core.ValueNode;

public class PyNumberNode extends ValueNode {
    public PyNumberNode(int lineNumber, double value) {
        super("PyNumber", lineNumber, value);
    }

    public double getNumber() {
        return (double) getValue();
    }
}
