package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperatures() {
        double sumOfTemperature = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            sumOfTemperature += temperature.getValue();
        }
        return sumOfTemperature / temperatures.getTemperatures().size();
    }

    public double calculateMadianTemperatures() {
        double median = 0, average = 0;
        double[] array = new double[temperatures.getTemperatures().size()];
        int i = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            array[i] = temperature.getValue();
            i++;
        }
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            average = array[array.length / 2] + array[(array.length / 2) - 1];
            median = average / 2.0;
        } else {
            median = array[array.length / 2];
        }
        return median;
    }
}