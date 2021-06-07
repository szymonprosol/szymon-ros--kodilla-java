package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Random random = new Random();

    public char getMove() {
        char move = (char) (random.nextInt(5)+1);
        return move;
    }
}