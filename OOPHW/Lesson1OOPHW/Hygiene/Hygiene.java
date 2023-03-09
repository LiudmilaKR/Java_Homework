package Homeworks.OOPHW.Lesson1OOPHW.Hygiene;

import Homeworks.OOPHW.Lesson1OOPHW.Goods;

public class Hygiene extends Goods {

    private int quantityInPack;

    public Hygiene(String name, double price, double quantity, String unit, int quantityInPack) {
        super(name, price, quantity, unit);
        this.quantityInPack = quantityInPack;
    }

    public int getQuantityInPack() {
        return quantityInPack;
    }

    @Override
    public String toString() {
        return "Предметы гигиены";
    }
    
}
