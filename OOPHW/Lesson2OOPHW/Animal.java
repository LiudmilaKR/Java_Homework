// 1.Рост животного
// 2.Вес животного
// 3.Цвет глаз животного
// И методы:
// 1.Издать звук
// 2.Напечатать информацию о животном

package Homeworks.OOPHW.Lesson2OOPHW;

public abstract class Animal {
    
    private int heightAnim;
    private int weightAnim;
    private String eyeColor;

    /**
     * Абстрактный класс Животное
     * @param heightAnim - рост животного
     * @param weightAnim - вес животного
     * @param eyeColor - цвет глаз животного
     */
    public Animal(int heightAnim, int weightAnim, String eyeColor) {
        this.heightAnim = heightAnim;
        this.weightAnim = weightAnim;
        this.eyeColor = eyeColor;
    }

    /**
     * Издать звук
     */
    public abstract void makeSound();

    public int getHeightAnim() {
        return heightAnim;
    }
    public int getWeightAnim() {
        return weightAnim;
    }
    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return "Животное с ростом " + heightAnim + " см, веса " + weightAnim + " кг, цвета глаз " + eyeColor;
    }
}
