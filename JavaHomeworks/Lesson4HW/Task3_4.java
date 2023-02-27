// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор.

package Homeworks.JavaHomeworks.Lesson4HW;

import java.util.LinkedList;
import java.util.Random;

public class Task3_4 {
    public static void main(String[] args) {
        LinkedList<Integer> taskList =  getLinkedList(5);
        System.out.println("Дан список LinkedList => " + taskList);
        System.out.println("Сумма элементов LinkedList составляет => " + sumElLinkList(taskList));
    }

    private static int sumElLinkList(LinkedList<Integer> taskList) {
        int sumEl = 0;
        for (Integer item : taskList) {
            sumEl += item;
        }
        return sumEl;
    }

    public static LinkedList<Integer> getLinkedList(int num) {
        LinkedList<Integer> someList = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            someList.add(i, rand.nextInt(1, 100));
        }
        return someList;
    }


    
}
