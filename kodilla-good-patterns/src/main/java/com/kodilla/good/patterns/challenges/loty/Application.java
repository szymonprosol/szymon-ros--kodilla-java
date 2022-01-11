package com.kodilla.good.patterns.challenges.loty;

public class Application {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        FlightRequest flightRequest = new FlightRequestRetriever().retrieve();

        flightFinder.findFlight(flightRequest);
    }
}
