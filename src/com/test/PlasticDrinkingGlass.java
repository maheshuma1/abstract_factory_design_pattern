package com.test;

public class PlasticDrinkingGlass implements DrinkingGlass{
    @Override
    public void drink() {
        System.out.println("Drinking water with the help of a plastic glass");
    }
}
