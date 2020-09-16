package main.java.com.maxfom.javacore.chapter06;
// В этой программе объявляем два объекта класса Box
class Boxy {
    double width;
    double height;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Boxy mybox1 = new Boxy();
        Boxy mybox2 = new Boxy();
        double vol;

        // присваиваем значения объекту (экземплярам)
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //присваиваем значения двугому экземпляру
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        //Объем второго параллелипепда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}