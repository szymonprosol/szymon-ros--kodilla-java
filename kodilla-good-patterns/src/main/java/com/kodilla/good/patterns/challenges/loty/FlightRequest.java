package com.kodilla.good.patterns.challenges.loty;

public class FlightRequest {

    private Client client;
    private String destinationAirport;
    private String departureAirport;
    private boolean directFlight;

    public FlightRequest(Client client, String destinationAirport, String departureAirport, boolean directFlight) {
        this.client = client;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.directFlight = directFlight;
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

    public boolean isDirectFlight() { return directFlight; }
}
