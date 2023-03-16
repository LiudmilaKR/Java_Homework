package Homeworks.OOPHW.Lesson3OOPHW;

public abstract class Figure implements Comparable<Figure> {

    private String area = "2D";

    public String getArea() {
        return area;
    }

    public abstract double countSquare();

    public abstract boolean checkInput();
}
