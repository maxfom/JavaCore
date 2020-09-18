package main.java.com.maxfom.javacore.chapter07;
// Демо применения аргументов переменной длины
public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
