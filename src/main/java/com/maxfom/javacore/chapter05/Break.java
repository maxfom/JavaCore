package main.java.com.maxfom.javacore.chapter05;
/*
    Применение оператора break в качественн цивилизованной
    формы оператора goto
 */
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
            third: {
                System.out.println("Предшествует оператору break.");
                if (t) break second; // выход из блока second
                System.out.println("Этот оператор не выполнится");
            }
                System.out.println("Этот оператор не выполнится");
            }
            System.out.println("Этот оператор работает, тк он за блоком second");
        }
    }
}
