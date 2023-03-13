// 3.Собака со свойством:
// 3.1 Наличие дрессировки(доступным только для чтения внешним классам)
// и методом:
// 3.2 Дрессировать

package Homeworks.OOPHW.Lesson2OOPHW.PetAnimal;

import java.time.LocalDate;

import Homeworks.OOPHW.Lesson2OOPHW.Interfaces.Train;

public class Dog extends PetAnimal implements Train {
    
    private boolean hasTrain;

    public Dog(int heightAnim, int weightAnim, String eyeColor, String nickName, String breed, boolean injection,
            String woolColor, LocalDate birthday, boolean hasTrain) {
        super(heightAnim, weightAnim, eyeColor, nickName, breed, injection, woolColor, birthday);
        this.hasTrain = hasTrain;
    }

    public boolean isHasTrain() {
        return hasTrain;
    }

    // @Override
    // public void fawn() {
    //     System.out.println("Ласкаюсь!");
    // }

    @Override
    public void makeSound() {
        System.out.println("Собака лает!");
    }

    @Override
    public void train() {
        System.out.println("Я - собака. Я дрессируюсь!"); 
    }

    @Override
    public String toString() {
        if (hasTrain) return "Собака по кличке " + super.getNickName() + " породы " + super.getBreed() + " шерсть окраса " + 
            super.getWoolColor() + ", дата рождения " + super.getBirthday() + " | дрессирован, рост " + super.getHeightAnim() + 
            " см, вес " + super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
            else return "Собака по кличке " + super.getNickName() + " породы " + super.getBreed() + " шерсть окраса " + 
            super.getWoolColor() + ", дата рождения " + super.getBirthday() + " | не дрессирован, рост " + super.getHeightAnim() + 
            " см, вес " + super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
    }
    
}
