// 2 . Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

// Сортировка пузырьком — один из самых известных алгоритмов сортировки.
// Здесь нужно последовательно сравнивать значения соседних элементов и менять числа местами,
// если предыдущее оказывается больше последующего.
// Таким образом элементы с большими значениями оказываются в конце списка, а с меньшими остаются в начале.


package Homeworks.JavaHomeworks.Lesson2HW;

// import java.lang.System.Logger;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;
import java.io.IOException;


public class Task2_2hw {
       
    public static void main(String[] args) throws IOException {

        Logger loging = Logger.getLogger(Task2_2hw.class.getName());
        FileHandler fh = new FileHandler("Homeworks/JavaHomeworks/Lesson2HW/log.txt");
        loging.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        int[] arr = get_array(11);
        arr[10] = 3;
        // System.out.println("Первоначальный массив");
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        loging.info("Первоначальный массив => " + Arrays.toString(arr));

        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            // System.out.println("i = " + i);
            // System.out.println(Arrays.toString(arr));
            loging.info("Результат " + (i + 1) + "-ого прохода по массиву => " + Arrays.toString(arr));
        }
        // System.out.println("Отсортированный массив");
        // System.out.println(Arrays.toString(arr));
        loging.info("Отсортитрованный массив => " + Arrays.toString(arr)); 
        // добавила после замечаний преподавателя, но не поняла, на каком этапе это необходимо делать
        fh.close();
    }

    public static int[] get_array(int n) {
        int[] some_array = new int[n];
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            some_array[i] = rand.nextInt(1, 100);  
        }
        return some_array;
    }  
}
