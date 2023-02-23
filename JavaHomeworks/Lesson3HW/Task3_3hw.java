// 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

package Homeworks.JavaHomeworks.Lesson3HW;

import java.util.ArrayList;
import java.util.Random;

public class Task3_3hw {
    public static void main(String[] args) {
        ArrayList<Integer> taskList = getArrayList(11);
        System.out.println("Дан целочисленный список ArrayList => " + taskList);
        int minList = getMinArrList(taskList);
        System.out.println("Минимальное число списка равно " + minList);
        int maxList = getMaxArrList(taskList);
        System.out.println("Минимальное число списка равно " + maxList);
        int middleArithm = getmiddleArithmArrList(taskList);
        System.out.println("Среднее арифметическое чисел списка равно " + middleArithm);
    }
    
    private static int getmiddleArithmArrList(ArrayList<Integer> someList) {
        int sum = 0;
        for (Integer el : someList) {
            sum += el;
        }
        System.out.println(sum);
        System.out.println(someList.size());
        int midAr = (Math.round((float)sum / (float)someList.size()));
        return midAr;
    }

    private static int getMinArrList(ArrayList<Integer> someList) {
        int curMin = 101;
        for (Integer el : someList) {
            if (el < curMin) curMin = el;
        }
        return curMin;
    }

    private static int getMaxArrList(ArrayList<Integer> someList) {
        int curMax = 0;
        for (Integer el : someList) {
            if (el > curMax) curMax = el;
        }
        return curMax;
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
