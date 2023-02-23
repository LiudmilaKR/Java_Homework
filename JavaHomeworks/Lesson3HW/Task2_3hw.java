// 2.Пусть дан произвольный список целых чисел, удалить из него четные числа

package Homeworks.JavaHomeworks.Lesson3HW;

import java.util.ArrayList;
import java.util.Random;

public class Task2_3hw {
    public static void main(String[] args) {

        ArrayList<Integer> taskList = getArrayList(11);
        System.out.println("Дан список чисел => " + taskList);
        deleteEvenNumbersFromList(taskList);
        System.out.println("Cписок после удаления четных чисел => " + taskList);
    }

    private static void deleteEvenNumbersFromList(ArrayList<Integer> someList) {
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) % 2 == 0) someList.remove(i);   
        }
    }

    private static ArrayList<Integer> getArrayList(int number) {
        ArrayList<Integer> someList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            someList.add(rand.nextInt(1, 100));
        }
        return someList;
    }
    
}
