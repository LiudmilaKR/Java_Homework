// АА.Абстрактный класс Домашнее животное
// Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:
// 1.Домашнее животное со следующими свойствами:
// 1.1 Кличка
// 1.2 Порода
// 1.3 Наличие прививок
// 1.4 Цвет шерсти
// 1.5 Дата рождения
// И методами:
// 1.5 Проявлять ласку

package Homeworks.OOPHW.Lesson2OOPHW.PetAnimal;

import java.time.LocalDate;

import Homeworks.OOPHW.Lesson2OOPHW.Animal;
import Homeworks.OOPHW.Lesson2OOPHW.Interfaces.Fawn;

public abstract class PetAnimal extends Animal implements Fawn {

    private String nickName;
    private String breed;
    private boolean injection;
    private String woolColor;
    private LocalDate birthday;

    /**
     * Абстрактный класс Домашнее животное
     * @param heightAnim - рост животного
     * @param weightAnim - вес животного
     * @param eyeColor - цвет глаз животного
     * @param nickName - кличка
     * @param breed - порода
     * @param injection - наличие прививок
     * @param woolColor - цвет шерсти
     * @param birthday - дата рождения
     */
    public PetAnimal(int heightAnim, int weightAnim, String eyeColor, String nickName, String breed, boolean injection,
            String woolColor, LocalDate birthday) {
        super(heightAnim, weightAnim, eyeColor);
        this.nickName = nickName;
        this.breed = breed;
        this.injection = injection;
        this.woolColor = woolColor;
        this.birthday = birthday;
    }

    public String getNickName() {
        return nickName;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getInjection() {
        return injection;
    }

    public String getWoolColor() {
        return woolColor;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Проявлять ласку
     */
    public void fawn() {
        System.out.println("Я - домашнее животное. Ласкаюсь!");
    }

    @Override
    public String toString() {
        return "Домашнее животное по кличке " + nickName + " породы " + breed + ", прививки " + injection + ", окрас"
                + woolColor + ", дата рождения " + birthday;
    }
    
}
