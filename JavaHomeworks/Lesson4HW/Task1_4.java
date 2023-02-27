// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
// Постараться не обращаться к листу по индексам.

package Homeworks.JavaHomeworks.Lesson4HW;

import java.util.LinkedList;
import java.util.Random;

// import javax.sql.rowset.spi.SyncFactoryException;

public class Task1_4 {
    public static void main(String[] args) {
        LinkedList<Integer> taskList = getLinkedList(11);
        System.out.println("Дан список LinkedList => " + taskList);
        System.out.println("Перевёрнутый список =>   " + getReversedLinkedList(taskList));
    }

    public static LinkedList<Integer> getReversedLinkedList(LinkedList<Integer> someLl) {
        LinkedList<Integer> rezLl = new LinkedList<>();
        for (Integer el : someLl) {
            rezLl.addFirst(el);
        }
        return rezLl;
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
