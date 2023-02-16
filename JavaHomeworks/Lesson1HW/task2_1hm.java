// 2. Вывести все простые числа от 1 до 1000

package Homeworks.JavaHomeworks.Lesson1HW;

public class task2_1hm {
    
    public static void main(String[] args) {
        int n = 1_000;
        System.out.printf("Простые числа от 1 до %d", n);
        System.out.println();
        System.out.println(2);
        for (int i = 3; i <= 7; i += 2){
            System.out.println(i);
        } 
        for (int i = 4; i <= n; i++){
            if ((i % 2 != 0)) {
                if ((i % 3 != 0) & (i % 5 != 0) & (i % 7 != 0)) {
                    System.out.println(i);
                }
            }
        }   
    }   
}

