package Homeworks.OOPHW.Lesson2OOPHW.Bird;

public class Chiken extends Bird {

    // public Chiken(int heightAnim, int weightAnim, String eyeColor, int heightFly) {
    //     super(heightAnim, weightAnim, eyeColor, heightFly);
    // }

    public Chiken(int heightAnim, int weightAnim, String eyeColor) {
        super(heightAnim, weightAnim, eyeColor, 0);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Курица кокает!"); 
    }

    
    @Override
    public String toString() {
        return "Курица, ростом " + super.getHeightAnim() + " см, весом " + super.getWeightAnim() + " кг, высота моего полета " + 
            super.getHeightFly() + " метров, цвет глаз " + super.getEyeColor();
    }

    // @Override
    // public void fly() {
    //     super.fly();
    // }
}
