package Homeworks.OOPHW.Lesson1OOPHW.Hygiene;

public class ToiletPaper extends Hygiene {

    private int quantLayers;

    public ToiletPaper(String name, double price, double quantity, String unit, int quantityInPack, int quantLayers) {
        super(name, price, quantity, unit, quantityInPack);
        this.quantLayers = quantLayers;
    }

    @Override
    public String toString() {
        return "Туалетная бумага " + super.getName() + " " + quantLayers + "-х слойная " + super.getQuantityInPack() + " " + super.getUnit() + 
        " в упаковке => количество " + super.getQuantity() + " " + super.getUnit() + " по цене " + 
        super.getPrice() + " руб. за 1 " + super.getUnit();
    }
    
}
