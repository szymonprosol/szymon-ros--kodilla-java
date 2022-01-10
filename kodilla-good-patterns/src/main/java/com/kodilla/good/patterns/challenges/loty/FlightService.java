package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;

public class FlightService {

    private List<Airport> airports = new FlightHolder().createAirports();

    public void printFlightsFromDepartureAirport(Airport departureAirport){
        departureAirport.getDestinationAirports().stream()
                .map(airport -> airport.getAirportName())
                .forEach(airport -> System.out.println(airport));
    }

    public void printFlightsToAirport(Airport arrivalAirport) {

        for (Airport airport : airports) {
            if (airport.getDestinationAirports().contains(arrivalAirport)) {
                System.out.println(airport.getAirportName());
            }
        }
    }

    //Gdańska przez <Kraków> do Wrocławia.
    public void printInterchangeAirports(String departureAirportName, String arrivalAirportName){

        Airport departureAirport = airports.stream()
                .filter(airport -> airport.getAirportName().equals(departureAirportName))
                .findAny().orElseThrow();
        Airport arrivalAirport =  airports.stream()
                .filter(airport -> airport.getAirportName().equals(arrivalAirportName))
                .findAny().orElseThrow();

        for(Airport interchangeAirport : departureAirport.getDestinationAirports()){
            if(interchangeAirport.getDestinationAirports().contains(arrivalAirport)){
                System.out.println("Departure "+departureAirport+", interchange "+interchangeAirport+", arrival "+arrivalAirportName);
            }
        }
    }



//    public void printPossibleFlights(FlightRequest flightRequest) {
//
//        if (flightRequest.getDepartureAirport() == null && flightRequest.getDestinationAirport() == null) {
//
//            System.out.println("Brak możliwoci wyszukania lotów");
//        } else if (flightRequest.getDestinationAirport() == null) {
//
//            airports.stream()
//                    .filter(airport -> airport.getAirportName() == flightRequest.getDepartureAirport())
//                    .map(airport -> airport.getDestinationAirports())
//                    .flatMap(a -> a.stream()
//                            .map(b -> b.getAirportName())).forEach(System.out::println);
//        } else if (flightRequest.getDepartureAirport() == null && flightRequest.isDirectFlight()) {
//
//            airports.stream()
//                    .map(a -> a.getDestinationAirports())
//                    .flatMap(a -> a.stream()
//                            .map(b -> b.getAirportName()))
//                    .filter(c -> c != flightRequest.getDestinationAirport())
//                    .forEach(System.out::println);
//        }
//    }
}
