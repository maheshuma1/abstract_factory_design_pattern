package com.test;

public class DrinkingGlassFactory extends AbstractDrinkingGlassFactory{
    @Override
    DrinkingGlass getDrinkingGlass(String glassType) {
        if(glassType.equalsIgnoreCase("crystal")) {
            return new CrystalDrinkingGlass();
        } else if(glassType.equalsIgnoreCase("plastic")) {
            return new PlasticDrinkingGlass();
        } else if(glassType.equalsIgnoreCase("steel")) {
            return new SteelDrinkingGlass();
        }
        throw new RuntimeException("No GlassType Found");
    }
}
