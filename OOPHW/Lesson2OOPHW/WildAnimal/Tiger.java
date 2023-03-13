package Homeworks.OOPHW.Lesson2OOPHW.WildAnimal;

import java.time.LocalDate;

public class Tiger extends WildAnimal {

    public Tiger(int heightAnim, int weightAnim, String eyeColor, String habitat, LocalDate findDate) {
        super(heightAnim, weightAnim, eyeColor, habitat, findDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Тигр рычит!");
        // super.makeSound();
    }

    @Override
    public String toString() {
        return "Тигр обитает в " + super.getHabitat() + ", дата нахождения " + super.getFindDate()+ " | рост " + 
        super.getHeightAnim() + " см, вес " + super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
    }
}
