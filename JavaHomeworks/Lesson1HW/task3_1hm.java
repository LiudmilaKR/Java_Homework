// 3. Реализовать простой калькулятор

package Homeworks.JavaHomeworks.Lesson1HW;

import java.util.Scanner;

public class task3_1hm {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число => ");
        float a = reader.nextFloat();
        System.out.println();
        System.out.print("Введите второе число => ");
        float b = reader.nextFloat();
        System.out.println();
        System.out.print("Введите операцию: + - * / => ");
        String oper = reader.next();
        System.out.println();
        reader.close();
        // System.out.println(a, b);
        // System.out.printf("%f %f %s", a, b, oper);
        if ("+".equals(oper)) {
            System.out.printf("%f + %f = %f", a, b, a + b);
        }
        if ("-".equals(oper)) {
            System.out.printf("%f - %f = %f", a, b, a - b);
        }
        if ("*".equals(oper)) {
            System.out.printf("%f * %f = %f", a, b, a * b);
        }
        if ("/".equals(oper)) {
            System.out.printf("%f / %f = %f", a, b, a / b);
        }
    }
    
}
