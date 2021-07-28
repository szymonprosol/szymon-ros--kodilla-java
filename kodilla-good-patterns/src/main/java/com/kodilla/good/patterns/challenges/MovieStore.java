package com.kodilla.good.patterns.challenges;

import java.util.*;

public class MovieStore {

    public final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();

    public final Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public Map<String, List<String>> getBooksTitlesWithTranslations() {
        return booksTitlesWithTranslations;
    }

    public void getList() {
          booksTitlesWithTranslations.values().stream()
                .flatMap(x -> x.stream())
                .forEach(x -> x = x + "!");
    }
}
