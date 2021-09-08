package com.test;

public class DrinkingGlassFactoryProducer {
    public static AbstractDrinkingGlassFactory getFactory(){
        return new DrinkingGlassFactory();
    }
}
