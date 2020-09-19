package main.java.com.maxfom.javacore.chapter08;
// Переопределяем метод

class ATest {
    int i, j;
    ATest(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class BTest extends ATest {
    int k;
    BTest(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // вывести содержимое переменной k с помощью метода,
    // переопределяющего метод show() из класса ATest
    void show() {
        System.out.println("k: " + k);
    }
}
public class Override {
    public static void main(String[] args) {
        BTest subOb = new BTest(1, 2, 3);
        subOb.show();   // здесь вызывает overrided метод из класса BTest
    }
}
