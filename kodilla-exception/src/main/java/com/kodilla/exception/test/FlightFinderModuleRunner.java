package com.kodilla.exception.test;

public class FlightFinderModuleRunner {

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Poznań Ławica", "Pekin");

        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Lotniska docelowego nie ma na liście!");
        } finally {
            System.out.println("Dziękujemy za skorzystanie z Naszych usług!");
        }
    }
}
