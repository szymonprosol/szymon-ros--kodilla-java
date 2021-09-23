package com.kodilla.good.patterns.Food2Door;

public class SMSService implements InformationService{

    @Override
    public void inform() {
        System.out.println("Dziękujemy za zakupy w naszej hurtowni, złożone zamówienie dotrze do Ciebie w ciągu 48h od otrzmania tej wiadomości.");
    }
}
