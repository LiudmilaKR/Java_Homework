package Homeworks.OOPHW.Lesson4OOPHW;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayClass<T> implements Comparator <T> {

    private int size;
    private ArrayList<T> someArray;

    
    public ArrayClass() {
        this(1);
        this.someArray = new ArrayList<>();
    }

    public ArrayClass(int size) {
        this.size = size;
        this.someArray = new ArrayList<>();
    }

    public void addT (T el) {
        someArray.add(el);
    }

    public int getSize() {
        return size;
    }

    public ArrayList<T> getSomeArray() {
        return someArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void delInd (int index) {
        if (someArray.isEmpty() == true) {
            System.out.println("Массив пуст! Удалять нечего!");
        }
        else {
            if (index >= getSomeArray().size()) System.out.println("Индекс вне пределов массива!");
            else someArray.remove(index);
            }
    }

    public void deElem (T el) {
        if (someArray.isEmpty() == true) {
            System.out.println("Массив пуст! Удалять нечего!");
        }
        else {
            if (someArray.contains(el)) someArray.remove(el);
            else System.out.println("Такого элемента нет в массиве!");
            }
    }

    @Override
    public int compare(T o1, T o2) {
        return (Integer)o1 - (Integer)o2;
    }

    public T arrayMin() {
        T min = someArray.get(0);
        for (T t : someArray) {
            if (compare(t, min) < 0) min = t;
        }
        return min;
    }

    public T arrayMax() {
        T max = someArray.get(0);
        for (T t : someArray) {
            if (compare(t, max) > 0) max = t;
        }
        return max;
    }
    
    public Integer arraySum() {
        Integer sum = 0;
        for (T t : someArray) {
            sum += (Integer)t;
        }
        return sum;
    }

    public Integer arrayMult() {
        Integer mult = 1;
        for (T t : someArray) {
            mult *= (Integer)t;
        }
        return mult;
    }

    @Override
    public String toString() {
        return "Массив ArrayClass [size=" + getSomeArray().size() + ", someArray=" + someArray + "]";
    }

    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    


    
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //
    //     return super.clone();
    // }
}
