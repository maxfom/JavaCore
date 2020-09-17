package main.java.com.maxfom.javacore.chapter07;
/*
    В этой программе демонстрируется отличие
    модификатора public и private.
 */
class Test4 {
    int a;              // доступ по умолчанию
    public int b;       // открытиый доступ
    private int c;      // закрытый доступ

    // методы доступа к члену c данного класса
    void setc(int i) {  // установить значенеи члена с данного класса
        c = i;
    }
    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        // Эти операторы правильны, поэтму члены a и b
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ошибку
        // ob.c = 100;         // ОШИБКА!

        // Доступ к члену c данного класса должен осуществляться
        // с помощью методов ее класса
        ob.setc(100);   // ВЕРНО!
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
