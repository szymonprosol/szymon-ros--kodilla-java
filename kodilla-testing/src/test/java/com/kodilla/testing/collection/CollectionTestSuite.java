package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
            System.out.println("Test Case: begin \n");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end \n");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin \n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "When created OddNumbersExterminator with empty list, " +
            "then testOddNumbersExterminatorEmptyList should return empty list."
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> empty = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(empty);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(0, result.size());
    }

    @DisplayName(
            "When created OddNumbersExterminator with a list of even and odd numbers, " +
            "then testOddNumbersExterminatorNormalList should return a list of even numbers."
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = exterminator.exterminate(Arrays.asList(1,2,3,4,5,6,8,6,8,8,8));
        System.out.println("Testing not empty list.");
        //Then
        Assertions.assertEquals(8, result.size());
    }
}
