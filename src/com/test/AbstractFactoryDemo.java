package com.test;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractDrinkingGlassFactory factory =DrinkingGlassFactoryProducer.getFactory();
        DrinkingGlass crystal = factory.getDrinkingGlass("crystal");
        crystal.drink();
        DrinkingGlass glass = factory.getDrinkingGlass("steel");
        glass.drink();
        DrinkingGlass plastic = factory.getDrinkingGlass("plastic");
        plastic.drink();
    }
}
