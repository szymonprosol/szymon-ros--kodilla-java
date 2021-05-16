package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> resultNumbers = new ArrayList<>();
    int exterminatedNumbers = 0;

    public List<Integer> exterminate(List<Integer> numbers) {

        for(Integer temp: numbers){

            if(temp % 2 == 0) {
                resultNumbers.add(temp);
            } else {
                exterminatedNumbers++;
            }
        }
        return resultNumbers;
    }
}
