package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        SaleRequestRetriever saleRequestRetriever = new SaleRequestRetriever();
        SaleRequest saleRequest = saleRequestRetriever.retrieve();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new Supplier("ExtraFoodShop","sp. z o. o.", LocalDate.of(1999,5,15))
                ,true, new MailService());
        HealthyShop healthyShop = new HealthyShop(new Supplier("HealthyShop","sp. komandytowa",LocalDate.of(2005,10,10))
                ,false, new SMSService());
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(new Supplier("GlutenFreeShop", "sp. jawna", LocalDate.of(1990,4,16))
                ,true, new MailService());

        if(saleRequest.getSupplier().getName().equals(extraFoodShop.getExtraFoodShop().getName())) {
            extraFoodShop.process();
        } else if (saleRequest.getSupplier().getName().equals(healthyShop.getHealthyShop().getName())) {
            healthyShop.process();
        } else if (saleRequest.getSupplier().getName().equals(glutenFreeShop.getGlutenFreeShop().getName())){
            glutenFreeShop.process();
        }
    }
}
