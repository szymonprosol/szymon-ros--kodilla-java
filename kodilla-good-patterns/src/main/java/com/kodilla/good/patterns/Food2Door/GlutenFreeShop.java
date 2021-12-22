package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements ContractExecutor {

    private Supplier glutenFreeShop;
    private boolean isAvailable;
    private InformationService informationService;

    public GlutenFreeShop(Supplier glutenFreeShop, boolean isAvailable, InformationService informationService) {
        this.glutenFreeShop = glutenFreeShop;
        this.isAvailable = isAvailable;
        this.informationService = informationService;
    }

    @Override
    public void process() {
        if (isAvailable) {
            informationService.inform();
        } else {
            System.out.println("Zamówienie nie zostało przyjęte");
        }
    }

    public Supplier getGlutenFreeShop() {
        return glutenFreeShop;
    }
}
