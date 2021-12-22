package com.kodilla.good.patterns.challenges;

public class User {

    private final String name;
    private final String surname;
    private final double userPrice;

    public User(String name, String surname, double userPrice) {
        this.name = name;
        this.surname = surname;
        this.userPrice = userPrice;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getUserPrice() {
        return userPrice;
    }
}
