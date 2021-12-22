package com.kodilla.good.patterns.Food2Door;

public class SaleRequest {

    private Supplier supplier;
    private Product product;

    public SaleRequest(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
