package main.java.com.maxfom.javacore.chapter05;
// Отсутствие некоторых частей оператора у цикла for
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i равно " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
