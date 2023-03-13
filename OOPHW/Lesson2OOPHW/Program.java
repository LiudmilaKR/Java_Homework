package Homeworks.OOPHW.Lesson2OOPHW;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Homeworks.OOPHW.Lesson2OOPHW.Interfaces.Fawn;
import Homeworks.OOPHW.Lesson2OOPHW.Interfaces.Fly;
import Homeworks.OOPHW.Lesson2OOPHW.Interfaces.Train;
import Homeworks.OOPHW.Lesson2OOPHW.PetAnimal.Cat;
// import Homeworks.OOPHW.Lesson2OOPHW.PetAnimal.PetAnimal;
import Homeworks.OOPHW.Lesson2OOPHW.WildAnimal.Tiger;

public class Program {

    public static void addToZoo(int anim, ArrayList <Animal> z) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        switch(anim) {
            case (1):
                int ha = rand.nextInt(50, 110); // рост кошауса
                int wa = rand.nextInt(50, 110); // вес котауса
                String[] eyeCol = new String[] {"зелёный", "серый", "голубой", "жёлтый", "коричневый"};
                String eca = eyeCol[rand.nextInt(eyeCol.length)]; // цвет глаз котауса
                System.out.println("Введите имя кота => ");
                String yca = sc.next();
                String[] breed = new String[] {"Британец", "Бенгальская", "Сибирская", "Сиамская", "Египетская"};
                String ba = breed[rand.nextInt(breed.length)]; // порода котауса
                Boolean ia = rand.nextBoolean();
                String[] woolCol = new String[] {"серый", "чёрный", "рыжий", "коричневый"};
                String wca = woolCol[rand.nextInt(woolCol.length)];
                LocalDate bd = LocalDate.of(rand.nextInt(2010, 2022), rand.nextInt(1, 12), 
                            rand.nextInt(1, 28)); // дата рождения
                Boolean iw = rand.nextBoolean();
                Cat someCat = new Cat(ha, wa, eca, yca, ba, ia, wca, bd, iw);
                z.add(someCat);
                System.out.println(someCat + " добавлен в зоопарк!");
                break;
            case (2):
                int ht = rand.nextInt(100, 300); // рост тигра
                int wt = rand.nextInt(150, 200); // вес вес
                String[] eyeColt = new String[] {"зелёный", "серый", "голубой", "жёлтый", "коричневый"};
                String ect = eyeColt[rand.nextInt(eyeColt.length)]; // цвет глаз тигра
                System.out.println("Введите имя среду обитания тигра => ");
                String habt = sc.next();
                LocalDate fd = LocalDate.of(rand.nextInt(1800, 2022), rand.nextInt(1, 12), 
                            rand.nextInt(1, 28));
                Tiger someTiger = new Tiger(ht, wt, ect, habt, fd);
                z.add(someTiger);
                System.out.println(someTiger + " добавлен в зоопарк!");
                break; 
        }
        sc.close();
    }

    public static void infoZoo(ArrayList <Animal> someZ) {
        for (Animal animal : someZ) {
            System.out.println(animal);
        }
    }

    public static void makeSound(ArrayList <Animal> someZ) {
        for (Animal animal : someZ) {
            System.out.println(animal);
            animal.makeSound();
        }
    }

    public static void doSomthing(ArrayList <Animal> someZ) {
        for (Animal animal : someZ) {
            if (animal instanceof Fly) {
                System.out.println(animal);
                ((Fly)animal).fly();
            }
            if (animal instanceof Train) {
                System.out.println(animal);
                ((Train)animal).train();
            }
            if (animal instanceof Fawn) {
                System.out.println(animal);
                ((Fawn)animal).fawn();
            }
        }
    }
}
