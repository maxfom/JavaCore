package main.java.com.maxfom.javacore.chapter05;
// Объявить переменную управления циклом в самом цикле for
public class ForTick {
    public static void main(String[] args) {
        for (int n = 10; n > 0; n--)
            System.out.println("такт " + n);
    }
}
