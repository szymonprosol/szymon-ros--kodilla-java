package com.kodilla.good.patterns.challenges.loty;

public class FlightRequest {

    private Client client;
    private String destinationAirport;
    private String departureAirport;

    public FlightRequest(Client client, String destinationAirport, String departureAirport) {
        this.client = client;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
    }

    public Client getClient() {
        return client;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }
}
