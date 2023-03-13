package Homeworks.OOPHW.Lesson2OOPHW.Bird;

public class Stork extends Bird {

    public Stork(int heightAnim, int weightAnim, String eyeColor) {
        super(heightAnim, weightAnim, eyeColor, 100);
    }

    @Override
    public void makeSound() {
        System.out.println("Аист издает аистиный звук!");  
    }

    @Override
    public String toString() {
        return "Аист, ростом " + super.getHeightAnim() + " см, весом " + super.getWeightAnim() + " кг, высота моего полета " + 
        super.getHeightFly() + " метров, цвет глаз " + super.getEyeColor();
    }

    // @Override
    // public void fly() {
    //     System.out.println("Я - птица аист! Я летаю на " + super.getHeightFly() + " метрах!");
    //     // super.fly();
    // }
    
}
