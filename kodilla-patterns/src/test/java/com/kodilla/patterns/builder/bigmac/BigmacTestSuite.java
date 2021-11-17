package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Cebula")
                .bun("z sezamem")
                .burgers(2)
                .sauce("1000 wysp")
                .ingredient("sałata")
                .ingredient("ser")
                .ingredient("ogórki")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);
        assertEquals(2, bigmac.getBurgers());
        assertEquals("z sezamem", bigmac.getBun());
    }
}
