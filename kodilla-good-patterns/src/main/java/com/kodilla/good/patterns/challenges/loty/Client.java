package com.kodilla.good.patterns.challenges.loty;

public class Client {

    private final String name;
    private final String surname;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
