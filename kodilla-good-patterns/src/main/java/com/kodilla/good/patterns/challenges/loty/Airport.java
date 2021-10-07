package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {

    private final String airportName;
    private final String airportLocation;
    private List<Airport> destinationAirports;

    public Airport(String airportName, String airportLocation) {
        this.airportName = airportName;
        this.airportLocation = airportLocation;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getAirportLocation() {
        return airportLocation;
    }

    public List<Airport> getDestinationAirports() {
        return destinationAirports;
    }

    public void setDestinationAirports(List<Airport> airports) {
        List<Airport> tempAirports = new ArrayList<>();

        for (Airport airport1 : airports) {
            if(airportName != airport1.getAirportName()) {
                tempAirports.add(airport1);
            }
        }
        destinationAirports = tempAirports;
    }
}
