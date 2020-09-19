package main.java.com.maxfom.javacore.chapter08;
// Методы с отличием сигнатуры - перегруженные,
// а не переопределяемые

class MaxA {
    int i, j;
    MaxA(int a, int b) {
        i = a;
        j = b;
    }

    // вывод содержимого
    void show() {
        System.out.println("i & j: " + i + " " + j);
    }
}

class MaxB extends MaxA {
    int k;
    MaxB(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // перегружаем метод show
    void show(String msg) {
        System.out.println(msg + k);
    }
}
public class Override2 {
    public static void main(String[] args) {
        MaxB subOb = new MaxB(1, 2, 3);

        subOb.show("Это пример из класса MaxB ");
        subOb.show();   // это метод из класса MaxA
    }
}
