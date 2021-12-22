package com.kodilla.good.patterns.challenges;

public class SalesDto {

    public User user;
    public boolean isSaled;

    public SalesDto(final User user, final boolean isSaled) {
        this.user = user;
        this.isSaled = isSaled;
    }

    public User getUser() { return user; }

    public boolean isSaled() { return isSaled; }
}
