package com.compiler.shop.visitor;

public final class AstUtil {
    private AstUtil() {}

    public static String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        char a = s.charAt(0);
        char b = s.charAt(s.length() - 1);
        if ((a == '"' && b == '"') || (a == '\'' && b == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
