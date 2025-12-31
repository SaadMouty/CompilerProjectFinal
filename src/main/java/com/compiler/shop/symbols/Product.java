package com.compiler.shop.symbols;

import java.util.Objects;

public class Product {
    private final String id;
    private String image;
    private String name;
    private double price;
    private String details;

    public Product(String id, String image, String name, double price, String details) {
        this.id = Objects.requireNonNull(id, "id");
        this.image = Objects.requireNonNull(image, "image");
        this.name = Objects.requireNonNull(name, "name");
        this.price = price;
        this.details = Objects.requireNonNull(details, "details");
    }

    public String getId() { return id; }
    public String getImage() { return image; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getDetails() { return details; }

    public void setImage(String image) { this.image = Objects.requireNonNull(image); }
    public void setName(String name) { this.name = Objects.requireNonNull(name); }
    public void setPrice(double price) { this.price = price; }
    public void setDetails(String details) { this.details = Objects.requireNonNull(details); }

    @Override
    public String toString() {
        return "Product{id='%s', name='%s', price=%s}".formatted(id, name, price);
    }
}
