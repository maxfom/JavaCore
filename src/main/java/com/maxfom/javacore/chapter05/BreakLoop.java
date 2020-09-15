package main.java.com.maxfom.javacore.chapter05;

import org.w3c.dom.ls.LSOutput;

/*
    Применение оператора break для выхода из цикла
 */
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)   {
            if ( i == 10) break;    // выход из цикла, если значение
                                    // переменной i равно 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
