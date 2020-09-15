package main.java.com.maxfom.javacore.chapter05;
//  Программа с break и ошибкой
public class BreakErr {
    public static void main(String[] args) {
        one: for (int i = 0; i < 3; i++) {
            System.out.print("Проход " + i + ": ");


            for (int j = 0; j < 100; j++) {
                if (j == 10) break one; // ошибка если не вложить цикл в цикл
                                        // нет доступа к блоку one
                System.out.print(j + " ");
            }
        }
    }
}
