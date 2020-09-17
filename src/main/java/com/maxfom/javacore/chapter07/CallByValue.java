package main.java.com.maxfom.javacore.chapter07;
// Аргументы примитивных типов передаются по их значению
class Tests {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
public class CallByValue {
    public static void main(String[] args) {
        Tests ob = new Tests();

        int a = 15, b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);

        ob.meth(a , b);

        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
