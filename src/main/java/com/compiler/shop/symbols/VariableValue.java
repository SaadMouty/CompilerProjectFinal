package com.compiler.shop.symbols;

import java.util.List;

public final class VariableValue {

    public enum Type { STRING, NUMBER, BOOLEAN, PRODUCT, LIST, NULL }

    private final Type type;
    private final Object value;

    private VariableValue(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public static VariableValue ofString(String v) { return new VariableValue(Type.STRING, v); }
    public static VariableValue ofNumber(double v) { return new VariableValue(Type.NUMBER, v); }
    public static VariableValue ofBoolean(boolean v) { return new VariableValue(Type.BOOLEAN, v); }
    public static VariableValue ofProduct(Product v) { return new VariableValue(Type.PRODUCT, v); }
    public static VariableValue ofList(List<?> v) { return new VariableValue(Type.LIST, v); }
    public static VariableValue nil() { return new VariableValue(Type.NULL, null); }

    public Type getType() { return type; }
    public Object raw() { return value; }

    public String asString() { return (String) value; }
    public double asNumber() { return (double) value; }
    public boolean asBoolean() { return (boolean) value; }

    @SuppressWarnings("unchecked")
    public <T> List<T> asList() { return (List<T>) value; }

    public Product asProduct() { return (Product) value; }

    @Override
    public String toString() {
        return type + ":" + value;
    }
}
