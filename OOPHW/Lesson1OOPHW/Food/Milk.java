package Homeworks.OOPHW.Lesson1OOPHW.Food;

import java.time.LocalDate;

public class Milk extends Food{

    private double fat;
    
    public Milk(String name, double price, double quantity, String unit, LocalDate expiration, double fat) {
        super(name, price, quantity, unit, expiration);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Молоко " + super.getName() + " жирность " + fat + "% => количество " + super.getQuantity() + " " + 
            super.getUnit() + " по цене " + super.getPrice() + " руб. за 1 " + super.getUnit() + 
            " | срок годности до " + super.getExpiration();
    }

    
}
