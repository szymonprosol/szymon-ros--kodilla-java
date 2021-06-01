package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rps {

    Scanner scanner = new Scanner(System.in);
    Map<Integer, User> gamers = new HashMap<>();
    Choice choice = new Choice();
    Computer computer = new Computer();
    private int gamersQuantity;
    private int wonGamesQuantity;
    private boolean end = false;

    public void printHello() {
        System.out.println("Życzę miłej rozgrywki!\n");
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
        } else gamersQuantity = 2;
        System.out.println();
    }

    public void setUsers() {
        String userID, userName;
        for (int i = 0; i < gamersQuantity; i++) {
            scanner.nextLine();
            System.out.println("Podaj nazwę gracza nr: " + (i + 1));
            userID = scanner.nextLine();

            System.out.println("Podaj imię gracza nr: " + (i + 1));
            userName = scanner.nextLine();

            gamers.put((i + 1), new User(userID, userName));
        }
        if (gamersQuantity == 1) {
            gamers.put(2, new User("KOMPUTER", "KOMPUTER"));
        }
        System.out.println("Wybrani gracze: ");
        gamers.values().forEach(System.out::println);

        System.out.println();
    }

    public void gameInstruction() {
        System.out.println("INSTRUKCJA DO GRY\n" +
                "- klawisz 1 - zagranie \"KAMIEN\"\n" +
                "- klawisz 2 - zagranie \"PAPIER\"\n" +
                "- klawisz 3 - zagranie \"NOZYCE\"\n" +
                "- klawisz 4 - zagranie \"JASZCZURKA\"\n" +
                "- klawisz 5 - zagranie \"SPOCK\"\n");
    }

    public void roundWinner(char firstPlayersMove, char secondPlayersMove) {
        if (firstPlayersMove != secondPlayersMove) {
            if ((firstPlayersMove == 1 && secondPlayersMove == 2) || (firstPlayersMove == 2 && secondPlayersMove == 3) || (firstPlayersMove == 3 && secondPlayersMove == 1)
                    || (firstPlayersMove == 4 && secondPlayersMove == 1) || (firstPlayersMove == 5 && secondPlayersMove == 4) || (firstPlayersMove == 3 && secondPlayersMove == 5)
                    || (firstPlayersMove == 4 && secondPlayersMove == 3) || (firstPlayersMove == 2 && secondPlayersMove == 4) || (firstPlayersMove == 5 && secondPlayersMove == 2)
                    || (firstPlayersMove == 1 && secondPlayersMove == 5)) {
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

    public String gameWinner() {
        int firstUser = gamers.get(1).getWonGamesQuantity();
        int secondUser = gamers.get(2).getWonGamesQuantity();

        if (firstUser > secondUser)
            return "Wygrał gracz " + gamers.get(1).getUserID() + " - " + gamers.get(1).getUserName();
        else return "Wygrał gracz " + gamers.get(2).getUserID() + " - " + gamers.get(2).getUserName();

    }

    public void quitGameOrNewGame() {
        String newOrEndHelp = "";
        char newOrEnd;
        boolean endMethod = false;

        while (!endMethod) {

            System.out.println("Jeśli chcesz zakończyć grę - Naciścij \"x\"\n" +
                    "Jeśli chcesz rozpocząć nową gre - Naciśnij \"n\"");
            scanner.nextLine();
            newOrEndHelp = scanner.nextLine();
            newOrEnd = newOrEndHelp.charAt(0);
            if (newOrEnd == 'x') {
                System.out.println("Czy na pewno chcesz opuścić rozgrywkę?\n" +
                        "TAK - Naciśnij \"x\"\n" +
                        "NIE - Naciśnij dowolny klawisz\n");
                newOrEndHelp = scanner.nextLine();
                newOrEnd = newOrEndHelp.charAt(0);
                if (newOrEnd == 'x') {
                    endMethod = true;
                    end = true;
                    System.out.println("KONIEC!");
                }
            }
            if (newOrEnd == 'n') {
                System.out.println("Czy na pewno chcesz rozpocząć nową rozgrywkę?\n" +
                        "TAK - Naciśnij \"n\"\n" +
                        "NIE - Naciśnij dowolny klawisz\n");
                newOrEndHelp = scanner.nextLine();
                newOrEnd = newOrEndHelp.charAt(0);
                if (newOrEnd == 'n') {
                    endMethod = true;
                    System.out.println("NOWA GRA!");
                }
            }
        }
    }

    public void playGame() {
        char firstPlayersMove, secondPlayersMove;

        printHello();
        setGamersQuantity();
        setUsers();
        setWonGamesQuantity();
        gameInstruction();
        while (!end) {
            while (wonGamesQuantity > 0) {
                System.out.println("Ruch gracza nr: 1");
                firstPlayersMove = (char) scanner.nextInt();
                if (firstPlayersMove == 1 || firstPlayersMove == 2 || firstPlayersMove == 3 || firstPlayersMove == 4 || firstPlayersMove == 5) {
                    System.out.print("Gracz " + gamers.get(1).getUserID());
                    choice.getChoice(firstPlayersMove);
                    if (gamersQuantity == 1) {
                        secondPlayersMove = computer.getMove();
                        System.out.print("Gracz " + gamers.get(2).getUserID());
                        choice.getChoice(secondPlayersMove);
                    } else {
                        System.out.println("Ruch gracza nr: 2");
                        secondPlayersMove = (char) scanner.nextInt();
                        System.out.print("Gracz " + gamers.get(2).getUserID());
                        choice.getChoice(secondPlayersMove);
                    }
                    roundWinner(firstPlayersMove, secondPlayersMove);
                    if (gamers.get(1).getWonGamesQuantity() == wonGamesQuantity || gamers.get(2).getWonGamesQuantity() == wonGamesQuantity) {
                        break;
                    }
                } else System.out.println("Niepoprawna komenda!");
            }
            System.out.println(gameWinner());
            quitGameOrNewGame();
        }
    }
}