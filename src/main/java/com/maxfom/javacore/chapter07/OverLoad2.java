package main.java.com.maxfom.javacore.chapter07;
// Применение автоматического преобразования типов к перегрузке
class OverLoadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющие наличие
    // двух целочисленных параметров
    void test (int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test (double a) {
        System.out.println(
                "Внутреннее преобразование при вызове test(double) a: " + a);
    }
}

class Overload2 {
    public static void main(String[] args) {
        OverLoadDemo2 ob = new OverLoadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);             // здесь вариант метода test(double)
        ob.test(123.2);     // здесь вариант метода test double
    }
}
