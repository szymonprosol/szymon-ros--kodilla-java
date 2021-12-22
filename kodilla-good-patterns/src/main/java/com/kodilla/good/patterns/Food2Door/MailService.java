package com.kodilla.good.patterns.Food2Door;

public class MailService implements InformationService{

    @Override
    public void inform() {

        System.out.println("Złożone przez Ciebie zamówienie zostło przyjęte do realizacji.");
    }
}
