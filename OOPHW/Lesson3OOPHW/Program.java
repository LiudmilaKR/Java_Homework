package Homeworks.OOPHW.Lesson3OOPHW;

import java.util.ArrayList;
import java.util.Scanner;

import Homeworks.OOPHW.Lesson3OOPHW.Polygon.Rectangle;
import Homeworks.OOPHW.Lesson3OOPHW.Polygon.Square;
import Homeworks.OOPHW.Lesson3OOPHW.Polygon.Triangle;

public class Program {

    
    public static void printInfo(ArrayList <Figure> someArList) {
        for (Figure fig : someArList) {
            System.out.println(fig);
        }
    }
    
    public static void addFigure(ArrayList <Figure> someArList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите фигуру, которую желаете добавить:\n1.Круг\n" + "2.Треугольник\n" + 
                    "3.Прямоугольник\n4.Квадрат");
        int fig = sc.nextInt();
        switch (fig) {
            case (1):
                System.out.println("Введите радиус круга => ");
                int r = sc.nextInt();
                Figure someCircle = new Circle(r);
                if (someCircle.checkInput()) {
                    someArList.add(someCircle);
                    System.out.println(someCircle + " добавлен в массив");
                } else System.out.println("Данные некорректны. Круг с радиусом = " + r + " не существует.");
                break;
            case (2):
                System.out.println("Введите первую сторону треугольника => ");
                Integer at = sc.nextInt();
                System.out.println("Введите вторую сторону треугольника => ");
                Integer bt = sc.nextInt();
                System.out.println("Введите третью сторону треугольника => ");
                Integer ct = sc.nextInt();
                Figure someTriangle = new Triangle(at, bt, ct);
                if (someTriangle.checkInput() && ((Triangle)someTriangle).checkMakeFigure()){
                    someArList.add(someTriangle);
                    System.out.println(someTriangle + " добавлен в массив");
                } else System.out.println("Данные некорректны. Треугольник со сторонами [" + at + ", " + bt + " " + ct + "] не существует.");
                break;
            case (3):
                System.out.println("Введите первую сторону прямоугольника => ");
                Integer ar = sc.nextInt();
                System.out.println("Введите вторую сторону прямоугольника => ");
                Integer br = sc.nextInt();
                Figure someRectangle = new Rectangle(ar, br);
                if (someRectangle.checkInput() && ((Rectangle)someRectangle).checkMakeFigure()){
                    someArList.add(someRectangle);
                    System.out.println(someRectangle + " добавлен в массив");
                } else System.out.println("Данные некорректны. Прямоугольник со сторонами [" + ar + ", " + br + "] не существует.");
                break;
            case (4):
                System.out.println("Введите сторону квадрата => ");
                Integer aq = sc.nextInt();
                Figure someSquare = new Square(aq);
                if (someSquare.checkInput() && ((Rectangle)someSquare).checkMakeFigure()){
                    someArList.add(someSquare);
                    System.out.println(someSquare + " добавлен в массив");
                } else System.out.println("Данные некорректны. Квадрат со стороной = " + aq + " не существует.");
                break;
        }
        sc.close();
    }

    public static void delFigure(ArrayList <Figure> someArList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс фигуры, которую хотите удалить, от 0 до " + (someArList.size() - 1));
        int ind = sc.nextInt();
        if (ind <= someArList.size() - 1) {
            Figure temp = someArList.get(ind);
            someArList.remove(ind);
            System.out.println("Фигура " + temp + " удалена из массива");
        } else System.out.println("Данные некорректны. Фигуры с индексом [" + ind + "]не существует в массиве.");
        sc.close();
    }

    public static void changeFigure(ArrayList <Figure> someArList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите индекс фигуры, которую хотите изменить, от 0 до " + (someArList.size() - 1));
        int ind = sc.nextInt();
        if (ind <= someArList.size() - 1) {
            Figure temp = someArList.get(ind);
            someArList.remove(ind);
            System.out.println("Фигура " + temp + " удалена из массива");
            addFigure(someArList);
        } else System.out.println("Данные некорректны. Фигуры с индексом [" + ind + "]не существует в массиве.");
        sc.close();
    }
}
