package com.compiler.shop.ast.jinja;

import com.compiler.shop.ast.core.AstNode;

public abstract class JinjaNode extends AstNode {
    protected JinjaNode(String type, int lineNumber) {
        super(type, lineNumber);
    }
}
