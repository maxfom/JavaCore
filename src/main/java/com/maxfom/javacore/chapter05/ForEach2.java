package main.java.com.maxfom.javacore.chapter05;
//  Применение оператора break в цикле for в стиле for each
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // испольуем цикл for в стиле for each для
        // вывода и суммирования значений из части массива
        for (int x : nums)  {
            System.out.println("Значение равно " + x);
            sum += x;
            if (x == 5) break;  // выход из цикла после 5 значений

        }
        System.out.println("Сумма первых пяти элементов равна " + sum);
    }
}
