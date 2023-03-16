package Homeworks.OOPHW.Lesson3OOPHW.Polygon;

public class Square extends Rectangle {

    public Square(Integer a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + super.getSides().get(0) + " | периметр => " + 
        super.countPerimeter() + " | площадь => " + super.countSquare();
    }
    

}
