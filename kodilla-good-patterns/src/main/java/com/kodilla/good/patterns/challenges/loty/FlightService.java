package com.kodilla.good.patterns.challenges.loty;

import java.util.*;

public class FlightService {

    private List<Airport> airports = new FlightHolder().createAirports();

    public void printFlightsFromDepartureAirport(String departureAirportName){
        Airport departureAirport = airports.stream()
                .filter(airport -> airport.getAirportName().equals(departureAirportName))
                .findAny().orElseThrow();

        System.out.println("From airport in " + departureAirportName + " you can fly to: ");
        departureAirport.getDestinationAirports().stream()
                .map(airport -> airport.getAirportName())
                .forEach(airport -> System.out.println(airport));
    }

    public void printFlightsToAirport(String arrivalAirportName) {
        Airport arrivalAirport =  airports.stream()
                .filter(airport -> airport.getAirportName().equals(arrivalAirportName))
                .findAny().orElseThrow();

        System.out.println("To airport in " + arrivalAirportName + " you can fly from: ");
        airports.stream()
                .filter(airport -> airport.getDestinationAirports().contains(arrivalAirport))
                .forEach(airport -> System.out.println(airport));
    }

    public void printInterchangeAirports(String departureAirportName, String arrivalAirportName){

        Airport departureAirport = airports.stream()
                .filter(airport -> airport.getAirportName().equals(departureAirportName))
                .findAny().orElseThrow();
        Airport arrivalAirport =  airports.stream()
                .filter(airport -> airport.getAirportName().equals(arrivalAirportName))
                .findAny().orElseThrow();

        System.out.println("You can fly to " + arrivalAirportName + " from " + departureAirportName + " with a transfer: ");
        departureAirport.getDestinationAirports().stream()
                .filter(airport -> airport.getDestinationAirports().contains(arrivalAirport))
                .forEach(airport -> System.out.println("Departure: "+departureAirportName+", interchange: "+airport.getAirportName()+", arrival: "+arrivalAirportName));
    }
}
