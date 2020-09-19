package main.java.com.maxfom.javacore.chapter08;
// В этой программе наследование применяется
// для расширения класса Box

class Box {
    private double width;
    private double height;
    private double depth;

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
        super(w, h, d); // вызов конструктора из супер класса
        weight = m;
    }

    // клон объекта делаем
    BoxWeight(BoxWeight ob) {   // передает объект конструктору
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double len, double m) {
        super (len);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }
}

// расширение класса Box, подключаем доп свойство
class ColorBox extends Box {
    String color;

    ColorBox(double w, double h, double d, String c) {
        super(w, h, d);
        color = c;
    }
}
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        ColorBox mybox3 = new ColorBox(5,6,5,"Красный");
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Цвет коробки " + mybox3.color);
    }
}
