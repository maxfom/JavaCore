package main.java.com.maxfom.javacore.chapter08;
// простой пример абстракции
abstract class ShamA {
    abstract void callme();

    // абстрактные классы могут содержать конкретные методы
    void callmetoo() {
        System.out.println("Это конкретный метод");
    }
}

class ShamB extends ShamA {
    void callme() {
        System.out.println("Реализация метода callme() из класса B.");
    }
}

public class AbstactDemo {
    public static void main(String[] args) {
        ShamB b = new ShamB();

        b.callme();
        b.callmetoo();
    }
}
