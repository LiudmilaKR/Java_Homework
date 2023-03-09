// 1. Название
// 2. Цена
// 3. Количество
// 4. Единица измерения

package Homeworks.OOPHW.Lesson1OOPHW;

/**
 * класс Товар
 */

public class Goods {

    private String name;
    
    private double price;
    private double quantity;
    private String unit;
    
    /**
     * Это конструктор Товар.
     * @param name - наименование товара
     * @param price - цена товара
     * @param quantity - количество товара
     * @param unit - единица измерения товара
     */
    public Goods(String name, double price, double quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

}
