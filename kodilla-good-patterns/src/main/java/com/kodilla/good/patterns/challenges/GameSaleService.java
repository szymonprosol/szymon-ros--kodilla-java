package com.kodilla.good.patterns.challenges;

public class GameSaleService implements SalesService {

    @Override
    public boolean sale(final User user, final double price, boolean isAvailable) {

        if(isAvailable && price <= user.getUserPrice() ) {
            System.out.println("Salling game to: " + user.getName() + " " + user.getSurname() + " for: " + user.getUserPrice());
            return true;
        } else {
            System.out.println("Sale failed!");
            return false;
        }
    }
}
