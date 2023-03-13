// АВ.Абстрактный класс Птица
// Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
// 1.Высота полёта
// и метод:
// 2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта и защищённый конструктор:
// 3.Конструктор принимающий высоту полёта И следующие классы-наследники:
// 1.Курица
// 2.Аист

package Homeworks.OOPHW.Lesson2OOPHW.Bird;

import Homeworks.OOPHW.Lesson2OOPHW.Animal;
import Homeworks.OOPHW.Lesson2OOPHW.Interfaces.Fly;

public abstract class Bird extends Animal implements Fly {

    private int heightFly; // высота полёта

    public Bird(int heightAnim, int weightAnim, String eyeColor, int heightFly) {
        super(heightAnim, weightAnim, eyeColor);
        this.heightFly = heightFly;
    }
    
    public int getHeightFly() {
        return heightFly;
    }
    
    public void fly() {
        System.out.println("Я - птица! Я летаю на " + heightFly + " метрах!");
    }

}
