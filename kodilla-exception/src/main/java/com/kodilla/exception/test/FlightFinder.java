package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    Map<String, Boolean> airports = new HashMap<>();

    public FlightFinder() {
        airports.put("Warszawa Okęcie", true);
        airports.put("Warszawa Modlin", false);
        airports.put("Wrocław", false);
        airports.put("Kraków Balice", false);
        airports.put("Katowice Pyrzowice", true);
    }

    public void findFilght(Flight flight) throws RouteNotFoundException {
        try {
            if (airports.get(flight.getArrivalAirport())) System.out.println("Możesz polecieć do: " + flight.getArrivalAirport());
            else System.out.println("Niestety nie możesz polecieć do: " + flight.getArrivalAirport());
        } catch (Exception e) {
            throw new RouteNotFoundException();
        }
    }
}
