package Homeworks.OOPHW.Lesson2OOPHW;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Homeworks.OOPHW.Lesson2OOPHW.Bird.Bird;
import Homeworks.OOPHW.Lesson2OOPHW.Bird.Chiken;
import Homeworks.OOPHW.Lesson2OOPHW.Bird.Stork;
import Homeworks.OOPHW.Lesson2OOPHW.PetAnimal.Cat;
import Homeworks.OOPHW.Lesson2OOPHW.PetAnimal.Dog;
import Homeworks.OOPHW.Lesson2OOPHW.PetAnimal.PetAnimal;
import Homeworks.OOPHW.Lesson2OOPHW.WildAnimal.Tiger;
import Homeworks.OOPHW.Lesson2OOPHW.WildAnimal.WildAnimal;
import Homeworks.OOPHW.Lesson2OOPHW.WildAnimal.Wolf;

public class Main {

    public static void main(String[] args) {

        WildAnimal tiger1 = new Tiger(200, 300, "жёлтые", "Африка", 
                            LocalDate.of(1827, 10, 20));
        WildAnimal wolf1 = new Wolf(130, 58, "зелёные", "Европа", 
                            LocalDate.of(1534, 5, 10), true);
        PetAnimal cat1 = new Cat(50, 4, "зелёные", "Барсик", "Британец", 
                            false, "голубой", LocalDate.of(2019, 11, 5), true);
        PetAnimal dog1 = new Dog(90, 70, "голубые", "Брон", "Овчарка", 
                            true, "коричневый", LocalDate.of(2018, 5, 25), true);
        Bird chiken1 = new Chiken(30, 3, "голубые");
        Bird stork1 = new Stork(50, 6, "жёлтые");
        
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(tiger1);
        zoo.add(wolf1);
        zoo.add(cat1);
        zoo.add(dog1);
        zoo.add(chiken1);
        zoo.add(stork1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие:\n1.Добавить животину в зоопарк\n" + "2.Убрать животину с номером i из зоопарка\n" + 
                    "3.Посмотреть инфо о животине с номером i\n4.Заставить животное с номером i издать звук\n" + 
                    "5.Инфо о животных в зоопарке\n6.Все животные в зоопарке издают звуки\n7.Все животные что-то делают");
        int point = scan.nextInt();
        switch (point) {
            case (1):
                System.out.println("Выберите животину:\n1.Кошка\n2.Тигр\n3.Волк\n4.Аист");
                int num = scan.nextInt();
                Program.addToZoo(num, zoo);
                break;
            case (2):
                System.out.println("Выберите индекс животного от 0 до " + (zoo.size() - 1));
                int number1 = scan.nextInt();
                Animal temp = zoo.get(number1);
                System.out.println("Под номером " + number1 + " в нашем зоопарке находится " + temp);
                zoo.remove(number1);
                System.out.println("Животное " + temp + " переехало в другой зоопарк.");
                break;
            case (3):
                System.out.println("Выберите индекс животного от 0 до " + (zoo.size() - 1));
                int number2 = scan.nextInt();
                System.out.println("Под номером " + number2 + " в нашем зоопарке находится " + zoo.get(number2));
                break;
            case (4):
                System.out.println("Выберите индекс животного от 0 до " + (zoo.size() - 1));
                int number3 = scan.nextInt();
                System.out.println("Под номером " + number3 + " в нашем зоопарке находится " + zoo.get(number3));
                zoo.get(number3).makeSound();
                break;
            case (5):
                System.out.println("На данный момент у нас в зоопарке!");
                Program.infoZoo(zoo);
                break;
            case (6):
                Program.makeSound(zoo);
                break;
            case (7):
                Program.doSomthing(zoo);
                break;
        }
        scan.close();

    }
}
