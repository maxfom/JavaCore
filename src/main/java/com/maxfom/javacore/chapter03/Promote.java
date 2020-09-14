package main.java.com.maxfom.javacore.chapter03;
/*
    Правила продвижения типов
 */
public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
        int rez = (int) result;
        System.out.println("Моя проверка - " + rez);
    }
}
