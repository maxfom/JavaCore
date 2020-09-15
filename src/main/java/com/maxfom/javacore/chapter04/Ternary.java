package main.java.com.maxfom.javacore.chapter04;
// Применение тернарной операции
public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i
        System.out.print("Абсолютное значаение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i;// получить абсолютное значение переменной i
        System.out.print("Абсолютное значение");
        System.out.println(i + " равно " + k);


    }
}
