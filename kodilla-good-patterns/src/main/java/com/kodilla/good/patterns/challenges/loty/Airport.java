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

        for (Airport airport : airports) {
            if(airportName != airport.getAirportName()) {
                tempAirports.add(airport);
            }
        }
        destinationAirports = tempAirports;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Airport airport = (Airport) o;

        return airportName != null ? airportName.equals(airport.airportName) : airport.airportName == null;
    }

    @Override public int hashCode() {
        return airportName != null ? airportName.hashCode() : 0;
    }

    @Override public String toString() {
        return "AirportName = " + airportName;
    }
}
