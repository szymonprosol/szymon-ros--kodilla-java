package com.kodilla.good.patterns.challenges;

public class GameSaleService implements SalesService {

    @Override
    public boolean sale(final User user, final double userPrice, final double price, boolean isAvailable) {

        if(isAvailable && price <= userPrice ) {
            System.out.println("Salling game to: " + user.getName() + " " + user.getSurname() + " for: " + userPrice);
            return true;
        } else {
            System.out.println("Sale failed!");
            return false;
        }
    }
}
