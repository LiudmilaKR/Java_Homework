package Homeworks.OOPHW.Lesson1OOPHW.BabyGoods;

/**
 * класс Подгузники
 */

public class Pampers extends BabeGoods {

    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Pampers(String name, double price, double quantity, String unit, int minAge, String gipoAllerg, int size,
            int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, minAge, gipoAllerg);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Подгузники детские " + super.getName() + " " + type + " " + super.getGipoAllerg() + " для детей от " + 
        super.getMinAge() + " лет " + " =>\n\tколичество " + super.getQuantity() + " " + super.getUnit() + " по цене " + 
        super.getPrice() + " руб. за 1 " + super.getUnit() + " | размер " + size + " | вес ребёнка от " + 
        minWeight + " до " + maxWeight + " кг";
    }
    
}
