package Homeworks.OOPHW.Lesson1OOPHW.Food;

import java.time.LocalDate;

public class Aggs extends Food {

    private int quantInPack;

    public Aggs(String name, double price, double quantity, String unit, LocalDate expiration, int quantInPack) {
        super(name, price, quantity, unit, expiration);
        this.quantInPack = quantInPack;
    }

    @Override
    public String toString() {
        return "Яйца " + super.getName() + " => количество " + super.getQuantity() + " " + 
        super.getUnit() + " по цене " + super.getPrice() + " руб. за 1 " + super.getUnit() + 
        " (в 1 " + super.getUnit() + " по " + quantInPack + " яиц) | срок годности до " + super.getExpiration();
    }    

}
