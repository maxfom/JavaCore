package main.java.com.maxfom.javacore.chapter06;
/*
    В данном примере программы для инициализации размеров
    параллепипеда в классе применяется параметризованный конструктор
 */

class Boxe {
    double width;
    double height;
    double depth;

    // Конструктор класса
    Boxe(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // расчет и возрат объема
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        // объявить и выделить память, инициализровать объекты типа Boxe
        Boxe mybox1 = new Boxe(10, 20, 25);
        Boxe mybox2 = new Boxe(3,6,9);

        double vol;

        // получаем объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получаем объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
