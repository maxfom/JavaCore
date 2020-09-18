package main.java.com.maxfom.javacore.chapter08;
// В этой программе наследование применяется
// для расширения класса Box

class Box {
    double width;
    double height;
    double depth;

    // клон объекта
    Box (Box ob) {  // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструкторк, когда все размеры
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    Box () {
        width = -1;   // значение -1
        height = -1;   // служит для обозначения
        depth = -1;     // неициализированного параллепипеда
    }

    // конструкторк, если куб
    Box (double len) {
        width = height = depth = len;
    }

    // расчет и возврат объема
    double volume() {
        return width * height * depth;
    }
}

// Расширяем класс Box, включив доп поле веса
class BoxWeight extends Box {
    double weight; // вес параллепипеда

    // конструктор веса
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}
