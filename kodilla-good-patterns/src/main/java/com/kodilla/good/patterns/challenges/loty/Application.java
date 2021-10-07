package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        FlightService flightService = new FlightService(new FlightRequestRetriever().retrieve());
        flightService.posibleFlight();
    }
}
