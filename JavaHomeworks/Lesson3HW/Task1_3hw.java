// 1.Реализовать алгоритм сортировки слиянием
// Оказалось, что на просторах интернета имеется как минимум 2-3 описания сортировки слиянием:
// 1) Естественное неймановское слияние - пока данные идут упорядоченно, они записываются в первый подмассив,
// далее следующие упорядоченные данные записываются во второй подмассив. Далее - опять возвращаемся в первый подмассив.
// После того, как данные с массива считаны в подмассивы, обрабатываются данные на этих подмассивах
// 2) Прямое слияние Боуза-Нельсона
// 3) То, чем в основном забит весь инет - разбиение до 1, и потом слияние обратно.

// Попробовала реализовать вариант 1, понимаю, что где-то "подглючивает", но времени разбирать, к сожалению, нет.
// Возможно, я изначально избрала далеко не самый оптимальный вариант.
// В любом случае - результат выдает корректный. :)

package Homeworks.JavaHomeworks.Lesson3HW;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Iterator;
import java.util.Random;

public class Task1_3hw {
    public static void main(String[] args) {
        
        int[] arr = getArray(17);
        System.out.println("Первоначальный массив =>  " + Arrays.toString(arr));
        // создаем лист номеров элементов, в которых завершает возрастать каждая из последовательностей
        ArrayList<Integer> pointList = new ArrayList<>();
        // подмассивы сливаются попарно, нечетный подмассив просто остается на месте в конце
        boolean flag = true;
        while (flag) {
            pointList = chooseArrItem(arr);
            // System.out.println(pointList);
            if (pointList.size() > 1) {
                int m = 0;
                if (pointList.size() % 2 == 0) m = pointList.size();
                else m = pointList.size() - 1;
                mergeStage(pointList, arr, m);
                // System.out.println("Промежуточный массив =>  " + Arrays.toString(arr));
                pointList = null;
            }
            else {
                System.out.println("Массив отсортирован!");
                flag = false;
            }
        }
        System.out.println("Отсортированный массив =>  " + Arrays.toString(arr));
        
    }
    
    public static int[] getArray(int n) {
        int[] some_array = new int[n];
        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            some_array[i] = rand.nextInt(1, 100);  
        }
        return some_array;
    }

    public static void mergeStage(ArrayList<Integer> someList, int[] array, int num) {
        int st1 = 0, st2 = 0, len = 0;
        for (int j = 0; j < num; j += 2) {
            st1 = someList.get(j);
            st2 = someList.get(j + 1);
            len = someList.get(j + 1) + 1 - len; 
            // сливание двух подмассивов сортировкой во временный массив
            // наверное, возможно обойтись и без временного массива, но подумать не хватило времени
            int[] arrTemp = arraySortMerge(array, st1, st2, len);
            // подстановка отсрортированных подмассивов в основной массив
            for (int k = st2 - len + 1, l = 0; k < (st2 + 1) | l < arrTemp.length; k++, l++) {
                array[k] = arrTemp[l];
            }
        }
    }
    
    public static ArrayList<Integer> chooseArrItem(int[] array) {
        ArrayList<Integer> someList = new ArrayList<>();
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) i += 1;
            else {   
                someList.add(i);
                i += 1;
            }  
        }
        if (someList.size() == 0 || someList.get(someList.size() - 1) < (array.length - 1)) someList.add(array.length - 1);
        return someList;
    }

    public static int[] arraySortMerge(int[] array, int stop1, int stop2, int length) {
        
        int[] arrayRes = new int[length];
        int i = stop2 - length + 1, j = stop1 + 1, k = 0;
        while (i < stop1 + 1 | j < stop2 + 1) {
            if (i > stop1) {
                arrayRes[k] = array[j];
                j += 1; k += 1;
            } else if (j > stop2) {
                arrayRes[k] = array[i];
                i += 1; k += 1;
            } else if (array[i] >= array[j]) {
                arrayRes[k] = array[j];
                j += 1; k += 1;
            } else {
                arrayRes[k] = array[i];
                i += 1; k += 1;
            }
        }
        return arrayRes;
    }
    
}
