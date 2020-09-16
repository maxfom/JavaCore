package main.java.com.maxfom.javacore.chapter06;
//  Метод volume() с возвратом return

class Boxing {
    double width;
    double height;
    double depth;

    // рассчитываем и возвращаем объем
    double volume() {
    return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Boxing mybox1 = new Boxing();
        Boxing mybox2 = new Boxing();
        double vol;

        // присваиваем значения объекту (экземплярам)
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присваиваем значения двугому экземпляру
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получаем объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получаем объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
