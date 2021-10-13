package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
         Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultOfAdd = calculator.add(5,5);
        double resultOfSub = calculator.sub(10,5);
        double resultOfMul = calculator.mul(5,5);
        double resultOfDiv = calculator.div(50,5);

        //Then
        assertEquals(10,resultOfAdd);
        assertEquals(5,resultOfSub);
        assertEquals(25,resultOfMul);
        assertEquals(10,resultOfDiv);
    }
}
