package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.Random;

public class ArrayOperationsTestSuite {

    Random random = new Random();

    @Test
    void testGetAverage() {
        //Given
        int[] array = new int[20];
        double expectedAverage = 0;
        double sum = 0;
        //When
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21 + 1);
            sum += array[i];
        }
        expectedAverage = sum / 20;
        //Then
        double resultAverage = ArrayOperations.getAverage(array);
        Assertions.assertEquals(expectedAverage, resultAverage);
    }
}
