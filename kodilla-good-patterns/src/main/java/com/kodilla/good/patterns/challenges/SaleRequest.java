package com.kodilla.good.patterns.challenges;

public class SaleRequest {

    private User user;
    private double price;
    private boolean isAvailable;

    public SaleRequest(final User user, double price, boolean isAvailable) {
        this.user = user;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public User getUser() { return user; }

    public double getPrice() {return price;}

    public boolean getIsAvailable() { return isAvailable; }
}
