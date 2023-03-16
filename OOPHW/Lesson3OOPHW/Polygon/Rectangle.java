package Homeworks.OOPHW.Lesson3OOPHW.Polygon;

import Homeworks.OOPHW.Lesson3OOPHW.Figure;

public class Rectangle extends Polygon {

    private Integer a;
    private Integer b;

    public Rectangle(Integer a, Integer b) {
        super.getSides().add(a);
        super.getSides().add(b);
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    @Override
    public Integer countPerimeter() {
        return super.countPerimeter() * 2;    
    }

    @Override
    public double countSquare() {
        return Math.round(super.getSides().get(0) * super.getSides().get(1) * 100d) / 100d;
    }

    @Override
    public boolean checkMakeFigure() {
        if (super.getSides().get(0) < super.getSides().get(0) + 2 * super.getSides().get(1) && 
        super.getSides().get(1) < super.getSides().get(1) + 2 * super.getSides().get(0)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами [" + super.getSides().get(0) + ", " + 
        super.getSides().get(1) + "] | периметр => " + 
        countPerimeter() + " | площадь => " + countSquare();
    }

    @Override
    public int compareTo(Figure o) {
        if (this.countSquare() > o.countSquare()) return 1;
        else if (this.countSquare() < o.countSquare()) return -1;
            else return 0;
    }
 
}
