package main.java.com.maxfom.javacore.chapter06;
/*
    Программа, использующая класс Box
    И основной класс BoxDemo
 */
public class Box {
    double width;
    double height;
    double depth;
}

// В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
                    // Присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // Рассчет объема параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
