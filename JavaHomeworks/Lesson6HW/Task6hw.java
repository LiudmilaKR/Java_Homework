// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// 1-55

package Homeworks.JavaHomeworks.Lesson6HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;


public class Task6hw {
    public static void main(String[] args) {

        Notebook note1 = new Notebook(1, 16, 128, "Linux", "black");
        Notebook note2 = new Notebook(2, 8, 64, "Windows", "silver");
        Notebook note3 = new Notebook(3, 16, 64, "Linux", "black");
        Notebook note4 = new Notebook(4, 16, 128, "Linux", "black");
        Notebook note5 = new Notebook(5, 8, 128, "Windows", "silver");
        Notebook note6 = new Notebook(2, 16, 128, "Windows", "silver");
        Notebook note7 = new Notebook(3, 16, 64, "Windows", "black");
        Notebook note8 = new Notebook(1, 8, 64, "Linux", "black");
        Notebook note9 = new Notebook(4, 16, 128, "Linux", "silver");
        Notebook note10 = new Notebook(2, 8, 64, "Windows", "black");
        Notebook note11 = new Notebook(2, 16, 128, "Windows", "black");

        ArrayList<Notebook> noteList = new ArrayList<>();
        noteList.add(note1);
        noteList.add(note2);
        noteList.add(note3);
        noteList.add(note4);
        noteList.add(note5);
        noteList.add(note6);
        noteList.add(note7);
        noteList.add(note8);
        noteList.add(note9);
        noteList.add(note10);
        noteList.add(note11);

        Scanner scan = new Scanner(System.in);
        
        // Вариант 1
        Set<Integer> mem = new HashSet<>();
        for (Notebook item : noteList) {
                mem.add(item.operMem);
            }
        System.out.print("Выберите объем оперативной памяти " + mem + " Гб => ");
        int op = scan.nextInt();

        Set<Integer> disk = new HashSet<>();
        for (Notebook item : noteList) {
            if (item.operMem == op) disk.add(item.hd);
        }
        System.out.print("Выберите объем жесткого диска " + disk + " Гб => ");
        int hdd = scan.nextInt();

        Set<String> syst = new HashSet<>();
        for (Notebook item : noteList) {
            if (item.operMem == op && item.hd == hdd) syst.add(item.operSystem);
        }
        System.out.print("Выберите операционную систему " + syst + " => ");
        String os = scan.next();

        Set<String> col = new HashSet<>();
        for (Notebook item : noteList) {
            if (item.operMem == op && item.hd == hdd && item.operSystem.equals(os)) col.add(item.color);
        }
        System.out.print("Выберите цвет ноутбука " + col + " => ");
        String c = scan.next();

        System.out.println("Ваши выбранные ноутбуки:");
        for (Notebook item : noteList) {
            if (item.operMem == op && item.hd == hdd && item.operSystem.equals(os) && item.color.equals(c)) {
                System.out.println(item);
            }
        }
        
        // Вариант 2 через Map, для 1-ой характеристики показала множественный выбор
        /*
        Map<String, Object> caracteristics = new HashMap<>();
        Set<Integer> caractInt1 = new HashSet<>();
        caractInt1.add(null);
        Set<Integer> caractInt2 = new HashSet<>();
        Set<String> caractStr1 = new HashSet<>();
        Set<String> caractStr2 = new HashSet<>();
        for (Notebook item : noteList) {
            caractInt1.add(item.operMem);
            caracteristics.put("opMem", caractInt1);
            caractInt2.add(item.hd);
            caracteristics.put("hdd", caractInt2);
            caractStr1.add(item.operSystem);
            caracteristics.put("opSys", caractStr1);
            caractStr2.add(item.color);
            caracteristics.put("coler", caractStr2);
        }
                
        Map<String, String> rezult = new HashMap<>();
        System.out.println(caracteristics);
        System.out.print("Выберите объем оперативной памяти " + caracteristics.get("opMem") + " Гб => ");
        String op = scan.next();
        try {
            if (op.equals("null")) {
                rezult.put("opMem", op);
            } else {
                if (caractInt1.contains(Integer.valueOf(op))) rezult.put("opMem", op);
                else System.out.println("Такого объема памяти нет");
            }
        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
        }
        System.out.print("Выберите объем жесткого диска " + caracteristics.get("hdd") + " Гб => ");
        String hard = scan.next();
        try {
            if (caractInt2.contains(Integer.valueOf(hard))) rezult.put("hdd", hard);
            else System.out.println("Такого объема диска нет");
        } catch (Exception e) {
            System.out.println("Некорректный ввод!");
        }
        System.out.print("Выберите операционную систему " + caracteristics.get("opSys") + " => ");
        String os = scan.next();
        if (caractStr1.contains(os)) rezult.put("opSys", os);
        else System.out.println("Некорректный ввод!");
        System.out.print("Выберите цвет " + caracteristics.get("coler") + " => ");
        String col = scan.next();
        if (caractStr2.contains(col)) rezult.put("coler", col);
        else System.out.println("Некорректный ввод!");
        System.out.println(rezult);
        
        System.out.println("Ваши выбранные ноутбуки:");
        if (rezult.get("opMem").equals("null")){
            for (Notebook item : noteList) {
                if (item.hd == Integer.valueOf(rezult.get("hdd")) && 
                item.operSystem.equals(rezult.get("opSys")) && item.color.equals(rezult.get("coler")))
                System.out.println(item);
            }
        } else for (Notebook item : noteList) {
            if (item.operMem == Integer.valueOf(rezult.get("opMem")) && item.hd == Integer.valueOf(rezult.get("hdd")) && 
                item.operSystem.equals(rezult.get("opSys")) && item.color.equals(rezult.get("coler")))
                System.out.println(item);
        }
        */
        scan.close();
    } 
}
