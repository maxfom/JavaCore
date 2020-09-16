package main.java.com.maxfom.javacore.chapter06;

import org.w3c.dom.ls.LSOutput;

// В этой программе впервые применяем метод, вводим его в класс Boxes
class Boxes {
    double width;
    double height;
    double depth;

    // высчитываем объем параллепипеда
    void volume()   {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Boxes mybox1 = new Boxes();
        Boxes mybox2 = new Boxes();

        // присваиваем значения объекту (экземплярам)
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присваиваем значения двугому экземпляру
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // объем первого параллепипеда
        mybox1.volume();

        // объем второго параллепипеда
        mybox2.volume();
    }
}
