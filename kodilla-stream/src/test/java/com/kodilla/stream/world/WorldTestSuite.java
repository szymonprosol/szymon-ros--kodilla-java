package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        List<Continent> continents = new ArrayList<>();
        List<Country> countriesOfEurop = new ArrayList<>();
        List<Country> countriesOfAsia = new ArrayList<>();
        List<Country> countriesOfNorthAmerica = new ArrayList<>();
        countriesOfEurop.add(new Country("Polska", new BigDecimal("62648624623864")));
        countriesOfEurop.add(new Country("Niemcy", new BigDecimal("462974917894724234")));
        countriesOfEurop.add(new Country("Francja", new BigDecimal("1643648175341827361")));
        countriesOfEurop.add(new Country("Wielka Brytania", new BigDecimal("45183647167846384")));
        countriesOfAsia.add(new Country("Chiny", new BigDecimal("12548132541654871578")));
        countriesOfAsia.add(new Country("Indie", new BigDecimal("3541354137486182374124")));
        countriesOfAsia.add(new Country("Rosja", new BigDecimal("12548147162834891326489134")));
        countriesOfAsia.add(new Country("Japonia", new BigDecimal("4137458173467136496148")));
        countriesOfNorthAmerica.add(new Country("Kanada", new BigDecimal("15341634891389471893274")));
        countriesOfNorthAmerica.add(new Country("Meksyk", new BigDecimal("5148538471634671649")));
        countriesOfNorthAmerica.add(new Country("USA", new BigDecimal("64619834813894619846249")));
        continents.add(new Continent("Europa", countriesOfEurop));
        continents.add(new Continent("Azja", countriesOfAsia));
        continents.add(new Continent("Ameryka Północna", countriesOfNorthAmerica));
        World world = new World(continents);
        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedSand = new BigDecimal("12635807293391531055663999");
        assertEquals(expectedSand, peopleQuantity);
    }
}
