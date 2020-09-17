package main.java.com.maxfom.javacore.chapter07;
/*
    Усовершенствованный класс Stack, в котором
    использован член длины массива
 */
class StackTest {
    private int stck[];
    private int tos;

    // выделить память под стек и инициализация
    StackTest(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length-2) // используем член длины массива
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        StackTest mystack1 = new StackTest(5);
        StackTest mystack2 = new StackTest(8);

        // размещаем числа в стеке
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
