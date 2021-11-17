package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Gratulacje " + user.getName() + ", właśnie zakończyłeś zakup naszego produktu, dziękujemy za zakpy w naszym sklepie.");
    }
}
