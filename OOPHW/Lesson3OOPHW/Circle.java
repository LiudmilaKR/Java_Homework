package Homeworks.OOPHW.Lesson3OOPHW;

public class Circle extends Figure {

    private int rad; // радиус круга

    public Circle(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    @Override
    public boolean checkInput() {
        return rad > 0 ? true : false;
    }

    @Override
    public double countSquare() {
        return Math.round(Math.PI * rad * rad * 100d) / 100d;
    }

    public double lenCircle() {
        return Math.round(2 * Math.PI * rad * 100d) / 100d;
    }

    @Override
    public String toString() {
        return "Круг радиусом " + rad + " | длина окружности => " + lenCircle() + " | площадь => " + countSquare();
    }

    @Override
    public int compareTo(Figure o) {
        if (this.countSquare() > o.countSquare()) return 1;
        else if (this.countSquare() < o.countSquare()) return -1;
            else return 0;
    }
    
}
