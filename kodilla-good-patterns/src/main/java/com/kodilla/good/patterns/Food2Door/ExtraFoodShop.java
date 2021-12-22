package com.kodilla.good.patterns.Food2Door;


public class ExtraFoodShop implements ContractExecutor{

    private Supplier extraFoodShop;
    private boolean isAvailable;
    private InformationService informationService;

    public ExtraFoodShop(Supplier extraFoodShop, boolean isAvailable, InformationService informationService) {
        this.extraFoodShop = extraFoodShop;
        this.isAvailable = isAvailable;
        this.informationService = informationService;
    }

    @Override
    public void process() {
        if (isAvailable) {
            informationService.inform();
        } else {
            System.out.println("Składanie zamówienia zostało przerwane");
        }
    }

    public Supplier getExtraFoodShop() {
        return extraFoodShop;
    }
}
