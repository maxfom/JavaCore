package main.java.com.maxfom.javacore.chapter05;
//  Поиск в массиве с применением цикла for в стиле for each
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 7, 8, 3, 1, 9, 6, 4};
        int val = 5;
        boolean found = false;

        // использовать цикл for в стиле for each для
        // поиска значения переменной val в массиве nums
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");
        else
            System.out.println("Такого значения нет");
    }
}
