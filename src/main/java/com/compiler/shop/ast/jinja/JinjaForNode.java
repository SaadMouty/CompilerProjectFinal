package com.compiler.shop.ast.jinja;

public class JinjaForNode extends JinjaNode {
    private final String loopVar;

    public JinjaForNode(int lineNumber, String loopVar) {
        super("JinjaFor", lineNumber);
        this.loopVar = loopVar;
    }

    public String getLoopVar() {
        return loopVar;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + loopVar + ")";
    }
}
