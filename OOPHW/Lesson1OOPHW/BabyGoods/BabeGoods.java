package Homeworks.OOPHW.Lesson1OOPHW.BabyGoods;

import Homeworks.OOPHW.Lesson1OOPHW.Goods;

/**
 * класс Товары для детей
 */

public class BabeGoods extends Goods {

    private int minAge;
    private String gipoAllerg;
    
    /**
     * Это конструктор Товары для детей
     *@param name - наименование товара
     * @param price - цена товара
     * @param quantity - количество товара
     * @param unit - единица измерения товара
     * @param minAge - минимальный возраст
     * @param gipoAllerg - гиппоаллергенность
     */
    public BabeGoods(String name, double price, double quantity, String unit, int minAge, String gipoAllerg) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.gipoAllerg = gipoAllerg;
    }

    public int getMinAge() {
        return minAge;
    }

    public String getGipoAllerg() {
        return gipoAllerg;
    }

    @Override
    public String toString() {
        return "Детские товары";
    }
       
}
