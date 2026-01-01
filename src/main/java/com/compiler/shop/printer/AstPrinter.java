package com.compiler.shop.printer;

import com.compiler.shop.ast.core.AstNode;

public class AstPrinter {

    public String print(AstNode root) {
        StringBuilder sb = new StringBuilder();
        printNode(root, sb, "", true);
        return sb.toString();
    }

    private void printNode(AstNode node, StringBuilder sb, String prefix, boolean isLast) {
        if (node == null) return;

        String className = node.getClass().getSimpleName(); // ✅ اسم العقدة = اسم الكلاس
        int line = node.getLineNumber();                    // ✅ رقم السطر

        sb.append(prefix);
        sb.append(isLast ? "└── " : "├── ");
        sb.append(className).append(" (line ").append(line).append(")");
        sb.append("\n");

        var children = node.getChildren();
        for (int i = 0; i < children.size(); i++) {
            boolean lastChild = (i == children.size() - 1);
            String newPrefix = prefix + (isLast ? "    " : "│   ");
            printNode(children.get(i), sb, newPrefix, lastChild);
        }
    }
}
