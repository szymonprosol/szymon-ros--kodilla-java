package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int addResult = calculator.add(2,2);
        int substractResult = calculator.substract(5,2);

        if (addResult == 4) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (substractResult == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
