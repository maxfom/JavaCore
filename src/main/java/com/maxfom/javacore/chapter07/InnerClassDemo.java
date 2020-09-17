package main.java.com.maxfom.javacore.chapter07;
// Демо применения внутреннего класса
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // это внутренний вложенный класс
    class Inner {
        void display() {
            System.out.println("вывод : outer_x = " + outer_x);
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
