package com.kodilla.optional;

public class User1 {

    private String name, text;
    private int age;
    private int weight;

    public User1(String name, int age, int weight, String text) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getText() {
        return text;
    }
}
