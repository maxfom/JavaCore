package main.java.com.maxfom.javacore.chapter08;
// Демо порядка вызова конструкторов

// создаем суперкласс

class M {
    M() {
        System.out.println("Конструктор M");
    }
}

// создаем подкласс, расширяем класс M
class N extends M {
    N() {
        System.out.println("Конструктор N");
    }
}

// еще один подкласс, расширяем подкласс N

class O extends N {
    O() {
        System.out.println("Конструктор O");
    }
}
public class CallingCons {
    public static void main(String[] args) {
        O ob = new O();
    }
}
