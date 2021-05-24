package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@DisplayName("TDD: Calculate Statistics Test Suite")

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuit {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.\n");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter + "\n");
    }

    @Test
    void testFor0Posts() {
        //Given
        int numberOfUsers = 10;
        List<String> usersQuantity = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersQuantity.add("JAN" + i);
        }
        int postQuantity = 0;
        int commentsQuantity = 1600;
        when(statisticsMock.usersNames()).thenReturn(usersQuantity);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = calculateStatistics.getPostsQuantity();
        double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
        double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
        double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
        //Then
        Assertions.assertEquals(0, quantityOfPosts);
        Assertions.assertEquals(0, averagePostsQuantityPerUser);
        Assertions.assertEquals(160, averageCommentsQuantityPerUser);
        Assertions.assertEquals(0, averageCommentsQuantityPerPost);
    }

    @Test
    void testFor1000Posts() {
        //Given
        int numberOfUsers = 10;
        List<String> usersQuantity = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersQuantity.add("JAN" + i);
        }
        int postQuantity = 1000;
        int commentsQuantity = 1600;
        when(statisticsMock.usersNames()).thenReturn(usersQuantity);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = calculateStatistics.getPostsQuantity();
        double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
        double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
        double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
        //Then
        Assertions.assertEquals(1000, quantityOfPosts);
        Assertions.assertEquals(100, averagePostsQuantityPerUser);
        Assertions.assertEquals(160, averageCommentsQuantityPerUser);
        Assertions.assertEquals(1.6, averageCommentsQuantityPerPost);
    }

    @Test
    void testFor0Comments() {
        //Given
        int numberOfUsers = 10;
        List<String> usersQuantity = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersQuantity.add("JAN" + i);
        }
        int postQuantity = 1000;
        int commentsQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(usersQuantity);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfComments = calculateStatistics.getCommentsQuantity();
        double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
        double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
        double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
        //Then
        Assertions.assertEquals(0, quantityOfComments);
        Assertions.assertEquals(100, averagePostsQuantityPerUser);
        Assertions.assertEquals(0, averageCommentsQuantityPerUser);
        Assertions.assertEquals(0, averageCommentsQuantityPerPost);
    }

    @Test
    void testForCommentsLessThanPosts() {
        //Given
        int numberOfUsers = 10;
        List<String> usersQuantity = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersQuantity.add("JAN" + i);
        }
        int postQuantity = 1000;
        int commentsQuantity = 100;
        when(statisticsMock.usersNames()).thenReturn(usersQuantity);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = calculateStatistics.getPostsQuantity();
        int quantityOfComments = calculateStatistics.getCommentsQuantity();
        double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
        double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
        double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
        //Then
        Assertions.assertEquals(1000, quantityOfPosts);
        Assertions.assertEquals(100, quantityOfComments);
        Assertions.assertEquals(100, averagePostsQuantityPerUser);
        Assertions.assertEquals(10, averageCommentsQuantityPerUser);
        Assertions.assertEquals(0.1, averageCommentsQuantityPerPost);
    }

    @Test
    void testForPostsLessThanComments() {
        //Given
        int numberOfUsers = 10;
        List<String> usersQuantity = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersQuantity.add("JAN" + i);
        }
        int postQuantity = 1000;
        int commentsQuantity = 1600;
        when(statisticsMock.usersNames()).thenReturn(usersQuantity);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfPosts = calculateStatistics.getPostsQuantity();
        int quantityOfComments = calculateStatistics.getCommentsQuantity();
        double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
        double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
        double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
        //Then
        Assertions.assertEquals(1000, quantityOfPosts);
        Assertions.assertEquals(1600, quantityOfComments);
        Assertions.assertEquals(100, averagePostsQuantityPerUser);
        Assertions.assertEquals(160, averageCommentsQuantityPerUser);
        Assertions.assertEquals(1.6, averageCommentsQuantityPerPost);
    }

    @Test
    void testFor0Users() {
        //Given
        int numberOfUsers = 0;
        List<String> usersQuantity = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersQuantity.add("JAN" + i);
        }
        int postQuantity = 1000;
        int commentsQuantity = 1600;
        when(statisticsMock.usersNames()).thenReturn(usersQuantity);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfUsers = calculateStatistics.getUsersQuantity();
        double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
        double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
        double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
        //Then
        Assertions.assertEquals(0, quantityOfUsers);
        Assertions.assertEquals(0, averagePostsQuantityPerUser);
        Assertions.assertEquals(0, averageCommentsQuantityPerUser);
        Assertions.assertEquals(1.6, averageCommentsQuantityPerPost);
    }

    @Test
    void testFor1000Users() {
        //Given
        int numberOfUsers = 1000;
        List<String> usersQuantity = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersQuantity.add("JAN" + i);
        }
        int postQuantity = 1000;
        int commentsQuantity = 1600;
        when(statisticsMock.usersNames()).thenReturn(usersQuantity);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int quantityOfUsers = calculateStatistics.getUsersQuantity();
        double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
        double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
        double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
        //Then
        Assertions.assertEquals(1000, quantityOfUsers);
        Assertions.assertEquals(1, averagePostsQuantityPerUser);
        Assertions.assertEquals(1.6, averageCommentsQuantityPerUser);
        Assertions.assertEquals(1.6, averageCommentsQuantityPerPost);
    }
}

