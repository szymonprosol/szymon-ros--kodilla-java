package com.kodilla.good.patterns.challenges.loty;

import java.util.ArrayList;
import java.util.List;

public class FlightHolder {
    public List<Airport> createAirports() {

        List<Airport> airports = new ArrayList<>();

        airports.add(new Airport("Warszawa Okęcie", "Warszawa"));
        airports.add(new Airport("Modlin", "Warszawa"));
        airports.add(new Airport("Wrocław", "Wrocław"));
        airports.add(new Airport("Poznań Ławica", "Poznań"));
        airports.add(new Airport("Kraków Balice", "Kraków"));
        airports.add(new Airport("Katowice Pyrzowice", "Katowice"));
        airports.add(new Airport("Łódź Lublinek", "Łódź"));
        airports.add(new Airport("Gdańsk Rębiechowo", "Gdańsk"));
        airports.add(new Airport("Bydgoszcz", "Bydgoszcz"));
        airports.add(new Airport("Rzeszów Jasionka", "Rzeszów"));
        airports.add(new Airport("Szczecin", "Szczecin"));
        airports.add(new Airport("Zielona Góra", "Zielona Góra"));

        for (Airport airport : airports) {
            airport.setDestinationAirports(airports);
        }
        return airports;
    }
}
