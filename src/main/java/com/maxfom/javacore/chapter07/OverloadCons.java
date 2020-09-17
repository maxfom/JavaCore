package main.java.com.maxfom.javacore.chapter07;
/*
    В данном примере конструкторы опередляются в классе Box для
    инициализации размеров параллепипеда тремя разными способами
 */

class Box {
    double width;
    double height;
    double depth;

    // консторуктор, используемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, когда ни один из размеров не указан
    Box() {
        width = -1;     // используем значение -1 для обозначения
        height = -1;    // неицилизоваронного
        depth = -1;     // параллепипеда
    }

    // конструтор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // расчет и возрат объема
    double volume() {
        return  width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String[] args) {
        // создать параллепипеды, используем разные
        // конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //получаем объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получаем объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получаем объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
