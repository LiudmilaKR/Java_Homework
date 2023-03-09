package Homeworks.OOPHW.Lesson1OOPHW.Baverage;

public class Limonad extends Beverage {

    public Limonad(String name, double price, double quantity, String unit, double volume, String unitVolume) {
        super(name, price, quantity, unit, volume, unitVolume);
    }

    @Override
    public String toString() {
        // return "Лимонад " + super.getName() + " " + super.getVolume() + " " + super.getUnitVolume() + 
        //     "а => количество " + super.getQuantity() + " " + super.getUnit() + " по цене " + 
        //     super.getPrice() + " руб. за 1 " + super.getUnit();
        return String.format("Лимонад %s %.1f %sа => количество %.0f %s по цене %.2f руб. за 1 %s", 
            super.getName(), super.getVolume(), super.getUnitVolume(), 
            super.getQuantity(), super.getUnit(), super.getPrice(), super.getUnit());
    }
    

}
