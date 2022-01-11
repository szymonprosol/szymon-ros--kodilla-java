package com.kodilla.good.patterns.challenges.loty;

public class FlightRequestRetriever {

    public FlightRequest retrieve() {

        Client client = new Client("Szymon", "Rosół");

        String destinationAirport = "Modlin";

        String departureAirport = "Poznań Ławica";

        boolean directFlight = false;

        return new FlightRequest(client,destinationAirport,departureAirport,directFlight);
    }
}
