package com.compiler.shop.interpreter;

public class RuntimeError extends RuntimeException {
    private final int line;

    public RuntimeError(int line, String message) {
        super("Runtime error at line " + line + ": " + message);
        this.line = line;
    }

    public int getLine() {
        return line;
    }
}
