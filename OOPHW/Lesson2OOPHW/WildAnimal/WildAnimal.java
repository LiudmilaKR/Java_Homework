// АБ.Абстрактный класс Дикое животное
// 2.Дикое животное со следующими свойствами:
// 2.1 Место обитания
// 2.2 Дата нахождения

package Homeworks.OOPHW.Lesson2OOPHW.WildAnimal;

import java.time.LocalDate;

import Homeworks.OOPHW.Lesson2OOPHW.Animal;

public class WildAnimal extends Animal {

    private String habitat;
    private LocalDate findDate;

    /**
     * @param heightAnim - рост животного
     * @param weightAnim - вес животного
     * @param eyeColor - цвет глаз животного
     * @param habitat - среда обитания
     * @param findDate - дата нахождения
     */
    public WildAnimal(int heightAnim, int weightAnim, String eyeColor, String habitat, LocalDate findDate) {
        super(heightAnim, weightAnim, eyeColor);
        this.habitat = habitat;
        this.findDate = findDate;
    }

    public String getHabitat() {
        return habitat;
    }

    public LocalDate getFindDate() {
        return findDate;
    }

    @Override
    public String toString() {
        return "Дикое животное, среда обитания " + habitat + ", дата нахождения " + findDate;
    }

    @Override
    public void makeSound() {
        System.out.println("Дикое животное издаёт непонятный звук...");
    }
    
}
