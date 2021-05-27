package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Computer computer = new Computer();

    public void game() {
        Rps rps = new Rps();
        Choice choice = new Choice();
        char move1, move2;

        rps.hello();
        rps.setGamersQuantity();
        rps.setUsers();
        rps.setWonGamesQuantity();
        int gamesQuantity = rps.getWonGamesQuantity();
        rps.gameInstruction();
        outer:
        if (!rps.isEnd()) {
            while (gamesQuantity > 0) {
                System.out.println("Ruch gracza nr: 1");
                move1 = (char) scanner.nextInt();
                System.out.print("Gracz " + rps.gamers.get(1).getUserID());
                choice.getChoice(move1);
                if (rps.getGamersQuantity() == 1) {
                    move2 = computer.getMove();
                    System.out.print("Gracz " + rps.gamers.get(2).getUserID());
                    choice.getChoice(move2);
                } else {
                    System.out.println("Ruch gracza nr: 2");
                    move2 = (char) scanner.nextInt();
                    System.out.print("Gracz " + rps.gamers.get(2).getUserID());
                    choice.getChoice(move2);
                }
                rps.getRoundWinner(move1, move2);
                if(rps.gamers.get(1).getWonGamesQuantity() == rps.getWonGamesQuantity() || rps.gamers.get(2).getWonGamesQuantity() == rps.getWonGamesQuantity()) {
                    gamesQuantity = 0;
                }
            }
            System.out.println(rps.getGameWinner());
        }
    }
}