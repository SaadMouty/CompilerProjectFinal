package com.compiler.shop.ast.python;

public class PyFuncCallNode extends PyExprNode {
    private final String functionName;

    public PyFuncCallNode(int lineNumber, String functionName) {
        super("PyFuncCall", lineNumber);
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + functionName + ")";
    }
}
