// 4.Волк со свойством:
// 4.1 Вожак стаи(доступным только для чтения внешним классам)

package Homeworks.OOPHW.Lesson2OOPHW.WildAnimal;

import java.time.LocalDate;

public class Wolf extends WildAnimal {

    private boolean isLeader;

    public Wolf(int heightAnim, int weightAnim, String eyeColor, String habitat, LocalDate findDate, boolean isLeader) {
        super(heightAnim, weightAnim, eyeColor, habitat, findDate);
        this.isLeader = isLeader;
    }

    public boolean isLeader() {
        return isLeader;
    }

    @Override
    public void makeSound() {
        System.out.println("Волк воет!");
    }

    @Override
    public String toString() {
        if (isLeader) return "Волк - вожак стаи, обитает в " + super.getHabitat() + ", дата нахождения " + super.getFindDate() + 
        " | рост " + super.getHeightAnim() + " см, вес " + super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
        else return "Волк - не вожак стаи, обитает в " + super.getHabitat() + ", дата нахождения " + super.getFindDate() + 
        " | рост " + super.getHeightAnim() + " см, вес " + super.getWeightAnim() + " кг, цвет глаз " + super.getEyeColor();
    }


    
}
