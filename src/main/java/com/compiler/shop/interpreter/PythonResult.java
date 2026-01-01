package com.compiler.shop.interpreter;

import com.compiler.shop.symbols.Product;

import java.util.List;

public final class PythonResult {
    public enum Type { NONE, PRODUCT_ID, PRODUCT, PRODUCTS }

    private final Type type;
    private final Object value;

    private PythonResult(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public static PythonResult none() { return new PythonResult(Type.NONE, null); }
    public static PythonResult productId(String id) { return new PythonResult(Type.PRODUCT_ID, id); }
    public static PythonResult product(Product p) { return new PythonResult(Type.PRODUCT, p); }
    public static PythonResult products(List<Product> ps) { return new PythonResult(Type.PRODUCTS, ps); }

    public Type getType() { return type; }
    public Object raw() { return value; }

    public String asProductId() { return (String) value; }
    public Product asProduct() { return (Product) value; }

    @SuppressWarnings("unchecked")
    public List<Product> asProducts() { return (List<Product>) value; }

    @Override
    public String toString() {
        return "PythonResult{" + type + ", " + value + "}";
    }
}
