package com.kodilla.good.patterns.challenges;

public class SaleRequestRetriever {

    public SaleRequest retrieve() {

        User user = new User("John", "Wekl", 130);

        boolean isAvailable = true;

        double price = 125.6;

        return new SaleRequest(user, price, isAvailable);
    }
}
