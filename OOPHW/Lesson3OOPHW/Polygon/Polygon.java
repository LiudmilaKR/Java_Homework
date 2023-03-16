package Homeworks.OOPHW.Lesson3OOPHW.Polygon;

import java.util.ArrayList;
import Homeworks.OOPHW.Lesson3OOPHW.Figure;
import Homeworks.OOPHW.Lesson3OOPHW.Perimeter;

public abstract class Polygon extends Figure implements Perimeter{

    private ArrayList<Integer> sides;
    
    public Polygon() {
        sides = new ArrayList<>();
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public abstract boolean checkMakeFigure();

    @Override
    public boolean checkInput() {
        int count = 0;
        for (Integer el : this.sides) {
            if (el <= 0) count += 1;
        }
        if (count > 0) return false; // Стороны не удовлетворяют условиям
        else return true; // Длины всех сторон фигуры > 0 
    }

    @Override
    public Integer countPerimeter() {
        Integer perim = 0;
        for (Integer el : sides) {
            perim += el;
        }
        return perim;      
    }

}
