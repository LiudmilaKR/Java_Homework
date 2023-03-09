package Homeworks.OOPHW.Lesson1OOPHW.Hygiene;

public class Mask extends Hygiene {

    public Mask(String name, double price, double quantity, String unit, int quantityInPack) {
        super(name, price, quantity, unit, quantityInPack);
    }

    @Override
    public String toString() {
        return "Маска " + super.getName() + " " + super.getQuantityInPack() + " " + super.getUnit() + 
            " в упаковке => количество " + super.getQuantity() + " " + super.getUnit() + " по цене " + 
            super.getPrice() + " рублей за 1 " + super.getUnit();
    }
    
}
