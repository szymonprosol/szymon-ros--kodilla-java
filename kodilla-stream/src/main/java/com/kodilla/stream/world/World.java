package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {

    private final List<Continent> continentList;

    public World(final List<Continent> continentList) {
        this.continentList = continentList;
    }

    public final BigDecimal getPeopleQuantity() {

        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public List<Continent> getContinentList() {
        return continentList;
    }
}
