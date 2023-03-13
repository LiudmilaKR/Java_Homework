// 1.Кот со свойством:
// 1.1 Наличие шерсти

package Homeworks.OOPHW.Lesson2OOPHW.PetAnimal;

import java.time.LocalDate;

public class Cat extends PetAnimal {
    
    private boolean isWool;

    /**
     * @param heightAnim - рост животного
     * @param weightAnim - вес животного
     * @param eyeColor - цвет глаз животного
     * @param nickName - кличка
     * @param breed - порода
     * @param injection - наличие прививок
     * @param woolColor - цвет шерсти
     * @param birthday - дата рождения
     * @param isWool - наличие шерсти
     */
    public Cat(int heightAnim, int weightAnim, String eyeColor, String nickName, String breed, boolean injection,
            String woolColor, LocalDate birthday, boolean isWool) {
        super(heightAnim, weightAnim, eyeColor, nickName, breed, injection, woolColor, birthday);
        this.isWool = isWool;
    }

    public boolean isWool() {
        return isWool;
    }

    @Override
    public String toString() {
        if (this.isWool) {
            if (super.getInjection()) return "Кот по кличке " + super.getNickName() + " породы " + super.getBreed() + " шерсть окраса " + 
            super.getWoolColor() + ", дата рождения " + super.getBirthday() + " | привит, рост " + super.getHeightAnim() + " см, вес " + 
            super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
            else return "Кот по кличке " + super.getNickName() + " породы " + super.getBreed() + " шерсть окраса " + 
            super.getWoolColor() + ", дата рождения " + super.getBirthday() + " | не привит, рост " + super.getHeightAnim() + " см, вес " + 
            super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
        }
        else {
            if (super.getInjection()) return "Кот по кличке " + super.getNickName() + " породы " + super.getBreed() + 
            " без шерсти окраса " + super.getWoolColor() + ", дата рождения " + super.getBirthday() + " | привит, рост " + super.getHeightAnim() + " см, вес " + 
            super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
            else return "Кот по кличке " + super.getNickName() + " породы " + super.getBreed() + " без шерсти окраса " + 
            super.getWoolColor() + ", дата рождения " + super.getBirthday() + " | не привит, рост " + super.getHeightAnim() + " см, вес " + 
            super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();  
        }
    }

    // @Override
    // public void fawn() {
    //     System.out.println("Ласкаюсь!");    
    // }

    @Override
    public void makeSound() {
        System.out.println("Кот мяукает!");
    }


}
