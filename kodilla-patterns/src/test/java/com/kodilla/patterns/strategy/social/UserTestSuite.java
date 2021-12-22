package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User marek = new Millenials("Marek");
        User szymon = new YGeneration("Szymon");
        User eryk = new ZGeneration("Eryk");

        //When
        String marekShare = marek.sharePost();
        System.out.println("Marek use: " + marekShare);
        String szymonShare = szymon.sharePost();
        System.out.println("Szymon use: " + szymonShare);
        String erykShare = eryk.sharePost();
        System.out.println("Eryk use: " + erykShare);

        //Then
        assertEquals("Twitter", marekShare);
        assertEquals("Facebook", szymonShare);
        assertEquals("Snapchat", erykShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User marek = new Millenials("Marek");

        //When
        String marekShare = marek.sharePost();
        System.out.println("Marek use: " + marekShare);
        marek.setSocialPublisher(new SnapchatPublisher());
        marekShare = marek.sharePost();
        System.out.println("Marek now use: " + marekShare);

        //Then
        assertEquals("Snapchat", marekShare);
    }
}
