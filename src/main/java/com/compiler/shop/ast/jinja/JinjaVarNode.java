package com.compiler.shop.ast.jinja;

public class JinjaVarNode extends JinjaExprNode {
    private final String path; // e.g. item.href

    public JinjaVarNode(int lineNumber, String path) {
        super("JinjaVar", lineNumber);
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + path + ")";
    }
}
