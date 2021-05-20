package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    int usersQuantity, postsQuantity, commentsQuantity;
    double averagePostsQuantityPerUser, averageCommentsQuantityPerUser, averageCommentsQuantityPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsQuantityPerUser = postsQuantity/usersQuantity;
        averageCommentsQuantityPerUser = commentsQuantity/usersQuantity;
        averageCommentsQuantityPerPost = commentsQuantity/postsQuantity;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsQuantityPerUser() {
        return averagePostsQuantityPerUser;
    }

    public double getAverageCommentsQuantityPerUser() {
        return averageCommentsQuantityPerUser;
    }

    public double getAverageCommentsQuantityPerPost() {
        return averageCommentsQuantityPerPost;
    }

    public String showStatistics() {
        return "Liczba użytkowników: " + getUsersQuantity() + " liczba postów: " + getPostsQuantity() + " liczba komentarzy: " + getCommentsQuantity()
                + " średnia liczba postów na użytkownka: " + getAveragePostsQuantityPerUser() + " średnia liczba komentarzy na użytkownika: " + getAverageCommentsQuantityPerUser()
                + " średnia liczba komentarzy na post: " + getAverageCommentsQuantityPerPost();
    }
}
