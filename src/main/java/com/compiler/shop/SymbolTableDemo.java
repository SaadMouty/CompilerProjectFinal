package com.compiler.shop;

import com.compiler.shop.symbols.SymbolTable;
import com.compiler.shop.symbols.VariableValue;

public class SymbolTableDemo {
    public static void main(String[] args) {
        SymbolTable st = new SymbolTable();

        // Global scope
        st.addVar("x", VariableValue.ofNumber(10));
        st.addVar("title", VariableValue.ofString("Shop"));
        System.out.println("---- Variables (after global) ----");
        System.out.println(st.dumpVariables());

        // Enter new scope
        st.enterScope();
        st.addVar("x", VariableValue.ofNumber(999)); // shadows global x
        st.addVar("y", VariableValue.ofNumber(20));
        System.out.println("---- Variables (after inner scope) ----");
        System.out.println(st.dumpVariables());

        // Exit scope
        st.exitScope();
        System.out.println("---- Variables (after exit scope) ----");
        System.out.println(st.dumpVariables());

        // Products
        String id1 = st.addProduct("img1.png", "Phone", 999.99, "Nice phone");
        st.addProduct("img2.png", "Laptop", 1499.0, "Powerful laptop");

        System.out.println("Products: " + st.getProducts());
        System.out.println("Phone details: " + st.findProductById(id1).getDetails());
    }
}
