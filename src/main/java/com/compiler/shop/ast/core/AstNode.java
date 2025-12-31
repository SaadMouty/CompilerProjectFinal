package com.compiler.shop.ast.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class AstNode {
    private final String nodeType;
    private final int lineNumber;
    private final List<AstNode> children = new ArrayList<>();

    protected AstNode(String nodeType, int lineNumber) {
        this.nodeType = Objects.requireNonNull(nodeType);
        this.lineNumber = lineNumber;
    }

    public String getNodeType() {
        return nodeType;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public List<AstNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(AstNode child) {
        if (child != null) children.add(child);
    }

    public void addChildren(List<? extends AstNode> nodes) {
        if (nodes == null) return;
        for (AstNode n : nodes) addChild(n);
    }

    /** Optional: friendly label for printers (type + extra). */
    public String label() {
        return nodeType;
    }
}
