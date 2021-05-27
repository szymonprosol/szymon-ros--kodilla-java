package com.kodilla.rps;

import java.util.Random;

public class Computer {
    Random random = new Random();

    public char getMove() {
        char move = (char) (random.nextInt(3)+1);
        return move;
    }
}