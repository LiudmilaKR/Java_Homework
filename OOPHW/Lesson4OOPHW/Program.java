// Реализовать класс для работы с одномерными динамическими массивами произвольных данных(произвольного типа).
// Класс будет иметь следующие конструкторы:
//+ 1. Конструктор без параметров – конструктор по умолчанию, проводяющий базовую иницаилизацию массива
//+ 2. Конструктор с параметром T[] – конструктор, который проводит инициализацию и заполняет массив данными, пришедшими из параметра
// Так же класс будет иметь следующие публичные методы:
//+ 1. Вставка в массив
//+ 2. Удаление элемента по индексу
//+ 3. Удаление всех элементов с заданным значением
//+ 4. Поиск минимума
//+ 5. Поиск максимума
//+ 6. Поиск суммы элементов массива
// 7. Поиск произведения элементов массива
//+ 8. Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
//+ 9. Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
// 10. Пузырьковая сортировка
// 11. Сортировка простыми вставками
// 12. Сортировка простым выбором
// 13. Получение элемента массива по индексу
// 14. Задание значения элементу массива с заданным индексом
//+ 15. Печать массива на экран
//+ 16. Длинна массива
// Так же класс должен содержать следующие приватные поля:
//+ 1. Сам массив произвольных данных.
//+ 2. Длинну массива
// *Так же массив должен содержать следующие перегруженные операторы:
//+ 1. Оператор, получающий элемент по заданному индексу
//+ 2. Оператор, позволяющий установить значение элемента по заданному индексу
// *Так же в случае, если могут произойти ошибки или некорретная работа в конструкторах или методах, необходимо использовать 
// механизм исключений для обработки возможных ошибок.

package Homeworks.OOPHW.Lesson4OOPHW;

import java.util.Random;

public class Program {

    public static void main(String[] args) {
        
        ArrayClass<Integer> arr1 = new ArrayClass<>(11);
        Random rand = new Random();
        for (int i = 0; i < arr1.getSize(); i++) {
            arr1.addT(rand.nextInt(1, 10));
        }
        System.out.println(arr1);
        arr1.delInd(2);
        System.out.println(arr1);
        arr1.deElem(7);
        System.out.println(arr1);
        System.out.printf("Минимум => %d", arr1.arrayMin());
        System.out.println();
        System.out.printf("Максимум => %d", arr1.arrayMax());
        System.out.println();
        System.out.printf("Сумма элементов массива => %d", arr1.arraySum());
        System.out.println();
        System.out.printf("Произведение элементов массива => %d", arr1.arrayMult());
    }
    
}
