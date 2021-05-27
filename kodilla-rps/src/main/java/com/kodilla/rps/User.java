package com.kodilla.rps;

import java.util.Objects;

public class User {

    private String userID;
    private String userName;
    private int wonGamesQuantity = 0;

    public User(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }

    public int addWonGame() {
        return wonGamesQuantity++;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public int getWonGamesQuantity() {
        return wonGamesQuantity;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userID, user.userID) && Objects.equals(userName, user.userName);
    }
}