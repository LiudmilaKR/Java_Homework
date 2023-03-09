package Homeworks.OOPHW.Lesson1OOPHW.Food;

import java.time.LocalDate;

import Homeworks.OOPHW.Lesson1OOPHW.Goods;

public class Food extends Goods{

    private LocalDate expiration;

    public Food(String name, double price, double quantity, String unit, LocalDate expiration) {
        super(name, price, quantity, unit);
        this.expiration = expiration;
    }
    
    @Override
    public String toString() {
        return "Продукты питания";
    }

    public LocalDate getExpiration() {
        return expiration;
    }
    
}
