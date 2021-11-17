package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements ContractExecutor{

    private Supplier healthyShop;
    private boolean isAvailable;
    private InformationService informationService;

    public HealthyShop(Supplier healthyShop, boolean isAvailable, InformationService informationService) {
        this.healthyShop = healthyShop;
        this.isAvailable = isAvailable;
        this.informationService = informationService;
    }

    @Override
    public void process() {
        if (isAvailable) {
            informationService.inform();
        } else {
            System.out.println("Niestety zamówienie zostało anulowane");
        }
    }

    public Supplier getHealthyShop() {
        return healthyShop;
    }
}
