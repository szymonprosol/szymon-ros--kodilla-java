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

            List<String> usersQuantity = new ArrayList<>();
            usersQuantity.add("Szymon");
            usersQuantity.add("Marta");
            usersQuantity.add("Bartek");
            usersQuantity.add("Marysia");
            usersQuantity.add("Eryk");
            usersQuantity.add("Maja");
            usersQuantity.add("Patryk");
            usersQuantity.add("Angelika");
            usersQuantity.add("Dominika");
            usersQuantity.add("Paweł");
            int postQuantity = 100;
            int commentsQuantity = 1600;
            when(statisticsMock.usersNames()).thenReturn(usersQuantity);
            when(statisticsMock.postsCount()).thenReturn(postQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);
        }

        @Test
        void testCalculateAdvStatistics() {
            //Given
            CalculateStatistics calculateStatistics = new CalculateStatistics();
            calculateStatistics.calculateAdvStatistics(statisticsMock);
            //When
            int quantityOfUsers = calculateStatistics.getUsersQuantity();
            int quantityOfPosts = calculateStatistics.getPostsQuantity();
            int quantityOfComments = calculateStatistics.getCommentsQuantity();
            double averagePostsQuantityPerUser = calculateStatistics.getAveragePostsQuantityPerUser();
            double averageCommentsQuantityPerUser = calculateStatistics.getAverageCommentsQuantityPerUser();
            double averageCommentsQuantityPerPost = calculateStatistics.getAverageCommentsQuantityPerPost();
            //Then
            Assertions.assertEquals(10, quantityOfUsers);
            Assertions.assertEquals(100, quantityOfPosts);
            Assertions.assertEquals(1600, quantityOfComments);
            Assertions.assertEquals(10, averagePostsQuantityPerUser);
            Assertions.assertEquals(160, averageCommentsQuantityPerUser);
            Assertions.assertEquals(16,averageCommentsQuantityPerPost);
        }
    }

