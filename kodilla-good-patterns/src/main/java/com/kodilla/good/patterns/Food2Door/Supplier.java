package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class Supplier {

    private final String name;
    private final String formLegal;
    private final LocalDate establishmentYear;

    public Supplier(String name, String formLegal, LocalDate establishmentYear) {
        this.name = name;
        this.formLegal = formLegal;
        this.establishmentYear = establishmentYear;
    }


    public String getName() {
        return name;
    }

    public String getFormLegal() {
        return formLegal;
    }

    public LocalDate getEstablishmentYear() {
        return establishmentYear;
    }
}
