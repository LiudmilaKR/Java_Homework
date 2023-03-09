package Homeworks.OOPHW.Lesson1OOPHW.Food;

import java.time.LocalDate;

public class Bread extends Food {

    private String flourType;

    public Bread(String name, double price, double quantity, String unit, LocalDate expiration, String flourType) {
        super(name, price, quantity, unit, expiration);
        this.flourType = flourType;
    }

    @Override
    public String toString() {
        return "Хлеб " + super.getName() + " из муки " + flourType + " => количество " + super.getQuantity() + " " + 
        super.getUnit() + " по цене " + super.getPrice() + " руб. за 1 " + super.getUnit() + 
        " | срок годности до " + super.getExpiration();
    }
    
}
