package main.java.com.maxfom.javacore.chapter06;
/*
    В данном примере программы для инициализации размеров
    параллепипедов в классе применяется конструктор
 */

class Boxos {
    double width;
    double height;
    double depth;

    // Используем конструктор класса Boxos
    Boxos() {
        System.out.println("Конструирование объекта Boxos");
        width = 10;
        height = 10;
        depth = 10;
    }

    // расчет и возрат объема
    double volume() {
        return width * height * depth;
    }
}
public class BoxDemo6 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализовать объекты типа Boxos
        Boxos mybox1 = new Boxos();
        Boxos mybox2 = new Boxos();

        double vol;

        // получаем объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получает объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
