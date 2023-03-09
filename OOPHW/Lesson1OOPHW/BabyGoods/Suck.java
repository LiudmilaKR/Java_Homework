package Homeworks.OOPHW.Lesson1OOPHW.BabyGoods;

/**
 * класс Соски
 */

public class Suck extends BabeGoods {

    public Suck(String name, double price, double quantity, String unit, int minAge, String gipoAllerg) {
        super(name, price, quantity, unit, minAge, gipoAllerg);
    }

    @Override
    public String toString() {
        return "Соска " + super.getName() + " для детей от " + super.getMinAge() + " лет " + super.getGipoAllerg() + 
        " => количество " + super.getQuantity() + " " + super.getUnit() + " по цене " + 
        super.getPrice() + " руб. за 1 " + super.getUnit();
    }

    
}
