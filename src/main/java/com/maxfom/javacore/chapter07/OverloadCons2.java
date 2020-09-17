package main.java.com.maxfom.javacore.chapter07;
/*
    В этой версии класса Boxx один объект допускается
    инициализировать другие объектом
 */
class Boxx {
    double width;
    double height;
    double depth;

    // Обращаем внимание на этот конструктор.
    // В качестве параметра в нем используется объект типа Boxx
    Boxx(Boxx ob) {   // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // консторуктор, используемый при указании всех размеров
    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, когда ни один из размеров не указан
    Boxx() {
        width = -1;     // используем значение -1 для обозначения
        height = -1;    // неицилизоваронного
        depth = -1;     // параллепипеда
    }

    // конструтор, используемый при создании куба
    Boxx(double len) {
        width = height = depth = len;
    }

    // расчет и возрат объема
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        // создать параллепипеды, используя разные конструкторы
        Boxx mybox1 = new Boxx(10, 20, 15);
        Boxx mybox2 = new Boxx();
        Boxx mycube = new Boxx(7);

        Boxx myclone = new Boxx(mybox1);
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

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
    }
}
