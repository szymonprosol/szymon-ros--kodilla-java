package com.kodilla.optional;

import com.kodilla.exception.nullpointer.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User1 user = new User1("user1", 30, 100, "Test");

        Optional<User1> optionalUser = Optional.ofNullable(user);

        String username =
                optionalUser.orElse(new User1("", 0, 0, "")).getName();

        System.out.println(username);
    }
}