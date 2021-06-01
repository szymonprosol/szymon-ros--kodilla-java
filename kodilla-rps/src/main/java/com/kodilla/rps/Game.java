package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Computer computer = new Computer();

    public void game() {
        Rps rps = new Rps();
        Choice choice = new Choice();
        char firstPlayersMove, secondPlayersMove;

        rps.hello();
        rps.setGamersQuantity();
        rps.setUsers();
        rps.setWonGamesQuantity();
        rps.gameInstruction();
        while (!rps.isEnd()) {
            int gamesQuantity = rps.getWonGamesQuantity();
            while (gamesQuantity > 0) {
                System.out.println("Ruch gracza nr: 1");
                firstPlayersMove = (char) scanner.nextInt();
                if (firstPlayersMove == 1 || firstPlayersMove == 2 || firstPlayersMove == 3 || firstPlayersMove == 4 || firstPlayersMove == 5) {
                    System.out.print("Gracz " + rps.gamers.get(1).getUserID());
                    choice.getChoice(firstPlayersMove);
                    if (rps.getGamersQuantity() == 1) {
                        secondPlayersMove = computer.getMove();
                        System.out.print("Gracz " + rps.gamers.get(2).getUserID());
                        choice.getChoice(secondPlayersMove);
                    } else {
                        System.out.println("Ruch gracza nr: 2");
                        secondPlayersMove = (char) scanner.nextInt();
                        System.out.print("Gracz " + rps.gamers.get(2).getUserID());
                        choice.getChoice(secondPlayersMove);
                    }
                    rps.getRoundWinner(firstPlayersMove, secondPlayersMove);
                    if (rps.gamers.get(1).getWonGamesQuantity() == rps.getWonGamesQuantity() || rps.gamers.get(2).getWonGamesQuantity() == rps.getWonGamesQuantity()) {
                        gamesQuantity = 0;
                    }
                } else System.out.println("Niepoprawna komenda!");
            }
            System.out.println(rps.getGameWinner());
            rps.quitGameOrNewGame();
        }
    }
}