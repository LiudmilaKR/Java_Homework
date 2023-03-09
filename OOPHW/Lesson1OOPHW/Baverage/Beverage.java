package Homeworks.OOPHW.Lesson1OOPHW.Baverage;

import Homeworks.OOPHW.Lesson1OOPHW.Goods;

public class Beverage extends Goods {
    
    
    private double volume;
    private String unitVolume;
    
    
    public Beverage(String name, double price, double quantity, String unit, double volume, String unitVolume) {
        super(name, price, quantity, unit);
        this.volume = volume;
        this.unitVolume = unitVolume;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public String getUnitVolume() {
        return unitVolume;
    }

    @Override
    public String toString() {
        return "Напитки";
    }
}
