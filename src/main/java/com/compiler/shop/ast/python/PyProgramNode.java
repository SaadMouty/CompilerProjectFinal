package com.compiler.shop.ast.python;

import com.compiler.shop.ast.core.RootNode;

public class PyProgramNode extends RootNode {
    public PyProgramNode(int lineNumber) {
        super("PyProgram", lineNumber);
    }
}
