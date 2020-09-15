package main.java.com.maxfom.javacore.chapter05;
// Применение цикла for в стиле for each
public class ForEach {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // используем цикл в стиле for each для вывода
        // и суммирования всех значений
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
        }
        System.out.println("Сумма равна " + sum);
    }
}
