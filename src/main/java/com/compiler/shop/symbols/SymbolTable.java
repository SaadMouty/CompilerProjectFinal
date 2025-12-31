package com.compiler.shop.symbols;

import java.util.*;

public class SymbolTable {

    // ---- Scopes for variables ----
    // Each scope: name -> value
    private final Deque<Map<String, VariableValue>> scopes = new ArrayDeque<>();

    // ---- Products storage ----
    private final Map<String, Product> productsById = new LinkedHashMap<>();

    public SymbolTable() {
        // global scope by default
        enterScope();
    }

    /* ================= Scopes ================= */

    public void enterScope() {
        scopes.push(new LinkedHashMap<>());
    }

    public void exitScope() {
        if (scopes.isEmpty()) {
            throw new SymbolTableException("No scope to exit");
        }
        scopes.pop();
        if (scopes.isEmpty()) {
            // always keep at least one global scope
            enterScope();
        }
    }

    /* ================= Variables API ================= */

    public void addVar(String name, VariableValue value) {
        requireName(name);
        Map<String, VariableValue> current = scopes.peek();
        if (current.containsKey(name)) {
            throw new SymbolTableException("Variable already exists in current scope: " + name);
        }
        current.put(name, value);
    }

    public void updateVar(String name, VariableValue value) {
        requireName(name);
        Map<String, VariableValue> scope = findScopeContaining(name);
        if (scope == null) {
            throw new SymbolTableException("Variable does not exist: " + name);
        }
        scope.put(name, value);
    }

    public VariableValue findVar(String name) {
        requireName(name);
        for (Map<String, VariableValue> scope : scopes) {
            if (scope.containsKey(name)) return scope.get(name);
        }
        throw new SymbolTableException("Variable not found: " + name);
    }

    public boolean existsVar(String name) {
        requireName(name);
        return findScopeContaining(name) != null;
    }

    public void removeVar(String name) {
        requireName(name);
        Map<String, VariableValue> scope = findScopeContaining(name);
        if (scope != null) scope.remove(name);
    }

    /** ✅ Required by teacher: print variables in all scopes */
    public String dumpVariables() {
        StringBuilder sb = new StringBuilder();
        int level = scopes.size();
        for (Map<String, VariableValue> scope : scopes) {
            sb.append("Scope ").append(level).append(":\n");
            if (scope.isEmpty()) {
                sb.append("  (empty)\n");
            } else {
                for (var e : scope.entrySet()) {
                    sb.append("  ").append(e.getKey()).append(" = ").append(e.getValue()).append("\n");
                }
            }
            level--;
        }
        return sb.toString();
    }

    private Map<String, VariableValue> findScopeContaining(String name) {
        for (Map<String, VariableValue> scope : scopes) {
            if (scope.containsKey(name)) return scope;
        }
        return null;
    }

    /* ================= Products API ================= */

    public String addProduct(String image, String name, double price, String details) {
        String id = UUID.randomUUID().toString();
        addProduct(new Product(id, image, name, price, details));
        return id;
    }

    public void addProduct(Product p) {
        Objects.requireNonNull(p, "product");
        if (productsById.containsKey(p.getId())) {
            throw new SymbolTableException("Product id already exists: " + p.getId());
        }
        productsById.put(p.getId(), p);
    }

    public Product findProductById(String id) {
        Product p = productsById.get(id);
        if (p == null) throw new SymbolTableException("Product not found (id): " + id);
        return p;
    }

    public boolean existsProductById(String id) {
        return productsById.containsKey(id);
    }

    public void updateProduct(String id, String image, String name, double price, String details) {
        Product p = findProductById(id);
        p.setImage(image);
        p.setName(name);
        p.setPrice(price);
        p.setDetails(details);
    }

    public void removeProductById(String id) {
        productsById.remove(id);
    }

    public List<Product> getProducts() {
        return List.copyOf(productsById.values());
    }

    /* ================= Helpers ================= */

    private static void requireName(String name) {
        if (name == null || name.isBlank()) {
            throw new SymbolTableException("Invalid name");
        }
    }
}
