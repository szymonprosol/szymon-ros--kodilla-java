package com.kodilla.good.patterns.challenges.loty;

public class FlightFinder {

    FlightService flightService = new FlightService();

    public void findFlight(FlightRequest flightRequest) {

        if (flightRequest.getDepartureAirport() == null && flightRequest.isDirectFlight()) {

            flightService.printFlightsToAirport(flightRequest.getDestinationAirport());

        } else if (flightRequest.getDestinationAirport() == null && flightRequest.isDirectFlight()) {

            flightService.printFlightsFromDepartureAirport(flightRequest.getDepartureAirport());

        } else if (!flightRequest.getDestinationAirport().isEmpty() && !flightRequest.getDepartureAirport().isEmpty() && !flightRequest.isDirectFlight()) {

            flightService.printInterchangeAirports(flightRequest.getDepartureAirport(), flightRequest.getDestinationAirport());

        } else {

            System.out.println("Brak możliwości wyszukania lotów");

        }
    }
}
