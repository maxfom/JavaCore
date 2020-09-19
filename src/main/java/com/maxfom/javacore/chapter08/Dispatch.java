package main.java.com.maxfom.javacore.chapter08;
// Динамическая диспетчеризация методов
class KolpA {
    void callme() {
        System.out.println("В методе callme() из класса KolpA");
    }
}

class KolpB extends KolpA {
    // переопределяем метод
    void callme() {
        System.out.println("В методе callme() из класса KolpB");
    }
}

class KolpC extends KolpA {
    // переопределяем метод callme()
    void callme() {
        System.out.println("В методе callme() из класса KolpC");
    }
}


public class Dispatch {
    public static void main(String[] args) {
        KolpA a = new KolpA();  // объект класса KolpA
        KolpB b = new KolpB(); // объект класса KolpB
        KolpC c = new KolpC(); // объект класса KolpC

        KolpA r;        // получаем ссылку на объект типа KolpA

        r = a;      // переменная r ссылает на объект типа KolpA
        r.callme(); // вызвать вариант метода callme() из класса KolpA

        r = b;      // переменная r ссылает на объект типа KolpB
        r.callme(); // вызвать вариант метода callme() из класса KolpB

        r = c;      // переменная r ссылает на объект типа KolpC
        r.callme(); // вызвать вариант метода callme() из класса KolpC
    }
}
