package main.java.com.maxfom.javacore.chapter06;
// Применяем метод с параметрами

class Boxez {
    double width;
    double height;
    double depth;

    // расчет и возврат объема
    double volume() {
        return width * height * depth;
    }

    // устанавливаем размеры параллепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
public class BoxDemo5 {
    public static void main(String[] args) {
        Boxez mybox1 = new Boxez();
        Boxez mybox2 = new Boxez();
        double vol;

        // инициализиция каждый объект с параметрами
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3,6,9);

        // получаем объем первого параллепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получаем объем второго параллепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
