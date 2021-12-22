package com.kodilla.good.patterns.challenges;

public class GameSaleRepository implements SalesRepository{

    @Override
    public void saleCreate(User user) {

        System.out.println("Historia Twoich zakupów w naszej bazie danych została zaktualizowana.");
    }
}
