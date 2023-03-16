package Homeworks.OOPHW.Lesson3OOPHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Homeworks.OOPHW.Lesson3OOPHW.Polygon.Rectangle;
import Homeworks.OOPHW.Lesson3OOPHW.Polygon.Square;
import Homeworks.OOPHW.Lesson3OOPHW.Polygon.Triangle;

public class Main {
    public static void main(String[] args) {
        
        ArrayList <Figure> differentFigures = new ArrayList<>();
        differentFigures.add(new Triangle(5, 6, 4));
        differentFigures.add(new Rectangle(10, 4));
        differentFigures.add(new Rectangle(7, 8));
        differentFigures.add(new Circle(8));
        differentFigures.add(new Circle(15));
        differentFigures.add(new Square(5));
        differentFigures.add(new Square(7));

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие:\n1.Инфо о фигурах с сортировкой по площади\n" + "2.Инфо о периметрах, площадях, длинах\n" + 
                    "3.Добавиить новую фигуру в массив\n4.Удалить фигуру из массива\n" + "5.Изменить фигуру по индексу");
        int point = scan.nextInt();
        switch (point) {
            case (1):
                Collections.sort(differentFigures);
                System.out.println("Фигуры в массиве отсортироваы по площади: ");
                Program.printInfo(differentFigures);
                break;
            case (2):
                System.out.println("Фигуры в массиве: ");
                Program.printInfo(differentFigures);
                break;
            case (3):
                Program.addFigure(differentFigures);
                System.out.println("Фигуры в массиве: ");
                Program.printInfo(differentFigures);
                break;
            case (4):
                System.out.println("Фигуры в массиве: ");
                Program.printInfo(differentFigures);
                Program.delFigure(differentFigures);
                System.out.println("Фигуры в массиве: ");
                Program.printInfo(differentFigures);
                break;
            case (5):
                System.out.println("Фигуры в массиве: ");
                Program.printInfo(differentFigures);
                Program.changeFigure(differentFigures);
                System.out.println("Фигуры в массиве: ");
                Program.printInfo(differentFigures);
                break;
        }
        scan.close();
    }
    
}
