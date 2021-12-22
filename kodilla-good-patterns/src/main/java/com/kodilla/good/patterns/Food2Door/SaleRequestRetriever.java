package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class SaleRequestRetriever {

    public SaleRequest retrieve() {

        Supplier supplier = new Supplier("ExtraFoodShop", "spółka z o.o.", LocalDate.of(1999,5,15));

        Product product = new Product("Główka sałaty", 100, 2.99);

        return new SaleRequest(supplier,product);
    }
}
