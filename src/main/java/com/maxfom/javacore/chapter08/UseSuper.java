package main.java.com.maxfom.javacore.chapter08;
// Используем super с целью предотвратить сокрытие имен
class X {
    int i;
}

class Y extends X {
    int i;  // этот член i скрывает член i из класса X

    Y(int a, int b) {
        super.i = a;    // член i из класса X
        i = b;          // член i из класса Y
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        Y subOb = new Y(1, 2);

        subOb.show();
    }


}
