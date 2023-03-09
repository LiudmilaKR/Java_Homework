//+ Реализовать класс товар, содержащий следующие свойства:
//+ 1. Название
//+ 2. Цена
//+ 3. Количество
//+ 4. Единица измерения
// А так же реализовать следующие классы-наследники:
//+ 1. Продукты питания, содержащие следующие свойства:
//+ 1.1 Срок годности
//+ 2. Напитки, содержащие следующие свойства:
//+ 2.1 Объём
//+ 3. Предметы гигиены, содержащие следующие свойства:
//+ 3.1 Количество штук в упаковке
//+ 4. Детские товары:
//+ 4.1 Минимальный возраст
//+ 4.2 Гипоаллергенность,
// А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):
//+ 5. Молоко, содержащиее следующее свойство: food
//+ 5.1 Процент жирности
//+ 5.2 Срок годности
//+ 6. Лимонад - beverage
//+ 7. Хлеб, содержащий следующие свойство: food
//+ 7.1 Тип муки
//+ 8. Яйца, содержащее следующиее свойство: food
//+ 8.1 Количество в упаковке
//+ 9. Маски - hygiene
//+ 10. Туалетная бумага, содержащее следующее свойство: hegiene
//+ 10.1 Количество слоёв
//+ 11. Подгузники, содержащие следующее свойства: baby
//+ 11.1 Размер
//+ 11.2 Минимальный вес
//+ 11.3 Максимальный вес
//+ 11.4 Тип
//+ 12. Соска baby
// У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, в котором будет
// происходить вывод всей информации о товаре, так же реализовать конструкторы, принимающие все поля.
// Реализовать в классе Program, метод выводящий все данные о товаре.
// Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program

package Homeworks.OOPHW.Lesson1OOPHW;

import java.time.LocalDate;
import java.util.ArrayList;

import Homeworks.OOPHW.Lesson1OOPHW.BabyGoods.BabeGoods;
import Homeworks.OOPHW.Lesson1OOPHW.BabyGoods.Pampers;
import Homeworks.OOPHW.Lesson1OOPHW.BabyGoods.Suck;
import Homeworks.OOPHW.Lesson1OOPHW.Baverage.Beverage;
import Homeworks.OOPHW.Lesson1OOPHW.Baverage.Limonad;
import Homeworks.OOPHW.Lesson1OOPHW.Food.Aggs;
import Homeworks.OOPHW.Lesson1OOPHW.Food.Bread;
import Homeworks.OOPHW.Lesson1OOPHW.Food.Food;
import Homeworks.OOPHW.Lesson1OOPHW.Food.Milk;
import Homeworks.OOPHW.Lesson1OOPHW.Hygiene.Hygiene;
import Homeworks.OOPHW.Lesson1OOPHW.Hygiene.Mask;
import Homeworks.OOPHW.Lesson1OOPHW.Hygiene.ToiletPaper;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Goods> food = new ArrayList<>();
        food.add(new Milk("Княгининское", 98.75, 100, "шт", 
            LocalDate.of(2023, 3, 10), 3.5));
        food.add(new Bread("Дарницкий", 45.7, 50, "шт", 
            LocalDate.of(2023, 3, 15), "пшеничная сорт высший"));
        food.add(new Aggs("Деревенские", 83.34, 25, "упак", 
            LocalDate.of(2023, 5, 8), 10));
        System.out.println(new Food(null, 0, 0, null, null));
        Program.listGoodsData(food);
        System.out.println();

        ArrayList<Goods> beverage = new ArrayList<>();
        beverage.add(new Limonad("Черноголовка", 56, 36, "бут", 1.5, "литр"));
        System.out.println(new Beverage(null, 0, 0, null, 0, null));
        Program.listGoodsData(beverage);
        System.out.println();

        ArrayList<Goods> hygiene = new ArrayList<>();
        hygiene.add(new Mask("Медицинская", 8, 800, "шт", 100));
        hygiene.add(new ToiletPaper("Ромашка", 10.57, 600, "шт", 6, 3));
        System.out.println(new Hygiene(null, 0, 0, null, 0));
        Program.listGoodsData(hygiene);
        System.out.println();

        ArrayList<Goods> babyg = new ArrayList<>();
        babyg.add(new Suck("Малыш", 123, 45, "шт", 0, "гипоаллергенная"));
        babyg.add(new Pampers("Хаггис", 835, 30, "упак", 0, "гипоаллергенные", 2, 2, 8, "усиленные"));
        System.err.println(new BabeGoods(null, 0, 0, null, 0, null));
        Program.listGoodsData(babyg);
        System.out.println();
    }

}
