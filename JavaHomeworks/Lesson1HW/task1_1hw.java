// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)
// n-ое треугольное число 1\2n(n+1)

package Homeworks.JavaHomeworks.Lesson1HW;

import java.util.Scanner;

public class task1_1hw {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите целое число n => ");
        int n = reader.nextInt();
        reader.close();
        int triangln = (n * (n + 1)) / 2;
        int fn = 1;
        if (n == 0) {
            fn = 1;
        }
        else {
        // int fn = 1;
            for (int k = 1; k < n + 1; k++) {
                fn *= k;
            }
        }
        System.out.printf("Треугольное число n = %d составляет %d", n, triangln);
        System.out.println();
        System.out.printf("%d факториал равен %d", n, fn);        
        
    }
}
