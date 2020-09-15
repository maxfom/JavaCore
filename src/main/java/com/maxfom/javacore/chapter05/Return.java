package main.java.com.maxfom.javacore.chapter05;
/*
    Демонстрация оператора return
 */
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if (t) return;  // возврат в вызывающий метод

        System.out.println("Это не выполняется, уже возврат в метод");
    }
}
