package Homeworks.OOPHW.Lesson3OOPHW.Polygon;

import Homeworks.OOPHW.Lesson3OOPHW.Figure;

public class Triangle extends Polygon {
    
    private Integer a;
    private Integer b;
    private Integer c;

    public Triangle(Integer a, Integer b, Integer c) {
        super.getSides().add(a);
        super.getSides().add(b);
        super.getSides().add(c);
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer getC() {
        return c;
    }
    
    @Override
    public double countSquare() {
        Integer p = (super.getSides().get(0) + super.getSides().get(1) + super.getSides().get(2)) / 2;
        return Math.round(Math.sqrt(p * (p - super.getSides().get(0)) * 
                    (p - super.getSides().get(1)) * (p - super.getSides().get(2))) * 100d) / 100d;
    }

    
    @Override
    public boolean checkMakeFigure() {
        if (super.getSides().get(0) + super.getSides().get(1) > super.getSides().get(2) && 
        super.getSides().get(1) + super.getSides().get(2) > super.getSides().get(0) && 
        super.getSides().get(0) + super.getSides().get(2) > super.getSides().get(1)) 
        return true;
        else return false;
    }
    
    @Override
    public String toString() {
        return "Треугольник со сторонами [" + super.getSides().get(0) + ", " + 
            super.getSides().get(1) + ", " + super.getSides().get(2) + "] | периметр => " + 
            super.countPerimeter() + " | площадь => " + countSquare();
    }

    @Override
    public int compareTo(Figure o) {
        if (this.countSquare() > o.countSquare()) return 1;
        else if (this.countSquare() < o.countSquare()) return -1;
            else return 0;
    }

    
}
