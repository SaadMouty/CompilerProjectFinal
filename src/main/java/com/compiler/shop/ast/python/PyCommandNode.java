package com.compiler.shop.ast.python;

public class PyCommandNode extends PyStatementNode {
    public enum CommandType {
        ADD_PRODUCT,
        GET_PRODUCTS,
        GET_PRODUCT_DETAILS,
        DELETE_PRODUCT
    }

    private final CommandType commandType;

    public PyCommandNode(int lineNumber, CommandType commandType) {
        super("PyCommand", lineNumber);
        this.commandType = commandType;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    @Override
    public String label() {
        return getNodeType() + "(" + commandType + ")";
    }
}
