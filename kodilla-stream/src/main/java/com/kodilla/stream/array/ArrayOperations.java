package com.kodilla.stream.array;

import java.util.stream.IntStream;
import java.util.stream.DoubleStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
                .asDoubleStream().average().getAsDouble();
    }
}
