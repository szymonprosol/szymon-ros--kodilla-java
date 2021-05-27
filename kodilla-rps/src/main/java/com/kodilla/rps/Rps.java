package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rps {

    Scanner scanner = new Scanner(System.in);
    Map<Integer, User> gamers = new HashMap<>();
    Choice choice = new Choice();
    private int gamersQuantity;
    private int wonGamesQuantity;
    private boolean end = false;

    public void hello() {
        System.out.println("Witamy w grze kamień, papier, nożyce.\n" +
                "Życzymy miłej rozgrywki!\n");
    }

    public void setWonGamesQuantity() {
        System.out.println("Podaj liczbę wygranych gier do zakończenia rozgrywki: ");
        wonGamesQuantity = scanner.nextInt();
        if (wonGamesQuantity <= 0) {
            System.out.println("Podana wartość mniejsza lub równa 0, ustawiono wartość domyślną - 1!");
            wonGamesQuantity = 1;
        }
        System.out.println();
    }

    public void setGamersQuantity() {
        System.out.println("Podaj liczbę graczy: (maksymalnie 2)");
        gamersQuantity = scanner.nextInt();
        if (gamersQuantity <= 1) {
            System.out.println("Zagrasz z komputerem!");
            gamersQuantity = 1;
        }
        if (gamersQuantity > 1) gamersQuantity = 2;
        System.out.println();
    }

    public void setUsers() {
        String userID, userName;
        for (int i = 0; i < gamersQuantity; i++) {
            scanner.nextLine();
            System.out.println("Podaj nazwę gracza nr: " + (i + 1));
            userID = scanner.nextLine();

            System.out.println("Podaj imię i nazwisko gracza nr: " + (i + 1));
            userName = scanner.nextLine();

            gamers.put((i + 1), new User(userID, userName));
        }
        if (gamersQuantity == 1) {
            gamers.put(2, new User("KOMPUTER", "KOMPUTER"));
        }
        System.out.println("Ustawieni gracze: ");
        gamers.values().forEach(System.out::println);
        System.out.println();
    }

    public void gameInstruction() {
        System.out.println("INSTRUKCJA DO GRY\n" +
                "- klawisz 1 - zagranie \"KAMIEN\"\n" +
                "- klawisz 2 - zagranie \"PAPIER\"\n" +
                "- klawisz 3 - zagranie \"NOZYCE\"\n" +
                "- klawisz x - zakończenie gry\n" +
                "- klawisz n - uruchomienie gry od nowa.\n");
    }

    public void getRoundWinner(char move1, char move2) {
        if (move1 != move2) {
            if ((move1 == 1 && move2 == 2) || (move1 == 2 && move2 == 3) || (move1 == 3 && move2 == 1)) {
                System.out.println("Rundę wygrał: " + gamers.get(2).getUserID());
                gamers.get(2).addWonGame();
            } else {
                System.out.println("Rundę wygrał: " + gamers.get(1).getUserID());
                gamers.get(1).addWonGame();
            }
        } else {
            System.out.println("Remis!\n");
        }
        System.out.println(gamers.get(1).getUserID() + " " + gamers.get(1).getWonGamesQuantity());
        System.out.println(gamers.get(2).getUserID() + " " + gamers.get(2).getWonGamesQuantity());
        System.out.println();
    }

    public String getGameWinner() {
        int firstUser = gamers.get(1).getWonGamesQuantity();
        int secondUser = gamers.get(2).getWonGamesQuantity();

        if (firstUser > secondUser) return "Wygrał gracz " + gamers.get(1).getUserID() + " - " + gamers.get(1).getUserName();
        else return "Wygrał gracz " + gamers.get(2).getUserID() + " - " + gamers.get(2).getUserName();

    }

    public char quitGameOrNewGame() {
        String newOrEndHelp1;
        char[] newOrEndHelp2;
        char newOrEnd;

        System.out.println("Jeśli chcesz zakończyć grę - Naciścij \"x\"\n" +
                "Jeśli chcesz rozpocząć nową gre - Naciśnij \"n\"");
        newOrEndHelp1 = scanner.nextLine();
        newOrEndHelp2 = newOrEndHelp1.toCharArray();
        newOrEnd = newOrEndHelp2[0];
        choice.getChoice(newOrEnd);
        newOrEndHelp1 = scanner.nextLine();
        newOrEndHelp2 = newOrEndHelp1.toCharArray();
        newOrEnd = newOrEndHelp2[0];
        if (newOrEnd == 'n' || newOrEnd == 'x') {

        }
        return newOrEnd;
    }

    public int getGamersQuantity() {
        return gamersQuantity;
    }

    public int getWonGamesQuantity() {
        return wonGamesQuantity;
    }

    public boolean isEnd() {
        return end;
    }
}