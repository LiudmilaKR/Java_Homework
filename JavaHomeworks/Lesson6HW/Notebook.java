package Homeworks.JavaHomeworks.Lesson6HW;

public class Notebook {
    int id;
    int operMem;
    int hd;
    String operSystem;
    String color;

    Notebook(int id, int operMem, int hd, String operSystem, String color) {
        this.id = id;
        this.operMem = operMem;
        this.hd = hd;
        this.operSystem = operSystem;
        this.color = color;
    }

    Notebook() {
        id = 0;
        operMem = 0;
        hd = 0;
        operSystem = "default";
        color = "default";
    }

    @Override
    public String toString() {
        return "Ноутбук id=" + id + " с объемом ОП " + operMem + " Гб на " + operSystem + ", цвет " + color + ", объём HDD " + hd + " Гб";
    }

}
