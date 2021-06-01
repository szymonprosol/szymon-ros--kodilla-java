package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warszawa Okęcie", true);
        airports.put("Warszawa Modlin", false);
        airports.put("Wrocław", false);
        airports.put("Kraków Balice", false);
        airports.put("Katowice Pyrzowice", true);

        try {
            if (airports.get(flight.getArrivalAirport()).booleanValue() == true)
                System.out.println("Możesz polecieć do: " + flight.getArrivalAirport());
            else System.out.println("Niestety nie możesz polecieć do: " + flight.getArrivalAirport());
        } catch (Exception e) {
            throw new RouteNotFoundException();
        }
    }
}
