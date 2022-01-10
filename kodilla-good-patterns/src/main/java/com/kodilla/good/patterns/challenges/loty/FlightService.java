package com.kodilla.good.patterns.challenges.loty;

import java.util.*;
import java.util.stream.Collectors;

public class FlightService {

    private final FlightRequest flightRequest;
    private List<Airport> airports = new FlightHolder().createAirports();

    public FlightService(FlightRequest flightRequest) {
        this.flightRequest = flightRequest;
    }

    public void posibleFlight() {

        if (flightRequest.getDepartureAirport() == null && flightRequest.getDestinationAirport() == null) {

            System.out.println("Brak możliwoci wyszukania lotów");
        } else if (flightRequest.getDestinationAirport() == null) {

            airports.stream()
                    .filter(airport -> airport.getAirportName() == flightRequest.getDepartureAirport())
                    .map(airport -> airport.getDestinationAirports())
                    .flatMap(a -> a.stream()
                            .map(b -> b.getAirportName())).forEach(System.out::println);
        } else if (flightRequest.getDepartureAirport() == null && flightRequest.isDirectFlight()) {

            airports.stream()
                    .map(a -> a.getDestinationAirports())
                    .flatMap(a -> a.stream()
                            .map(b -> b.getAirportName()))
                    .filter(c -> c != flightRequest.getDestinationAirport())
                    .forEach(System.out::println);
        } else if (flightRequest.getDepartureAirport() == null && !flightRequest.isDirectFlight()) {

        }
    }
}
