package com.kodilla.good.patterns.Food2Door;

public class Product {

    private final String productName;
    private final int quantity;
    private final double price;

    public Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
