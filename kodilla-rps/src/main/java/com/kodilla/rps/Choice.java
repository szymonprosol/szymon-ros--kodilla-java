package com.kodilla.rps;

public class Choice {
    public void getChoice(char choice) {
        if (choice == 1) System.out.println(" wybrał \"KAMIEN\"\n");
        if (choice == 2) System.out.println(" wybrał \"PAPIER\"\n");
        if (choice == 3) System.out.println(" wybrał \"NOZYCE\"\n");
        if (choice == 'x') {
            System.out.println("Czy na pewno chcesz opuścić rozgrywkę?\n" +
                    "TAK - Naciśnij \"x\"\n" +
                    "NIE - Naciśnij \"z\"\n");
        }
        if (choice == 'n') {
            System.out.println("Czy na pewno chcesz rozpocząć nową rozgrywkę?\n" +
                    "TAK - Naciśnij \"n\"\n" +
                    "NIE - Naciśnij \"z\"\n");
        }
    }
}