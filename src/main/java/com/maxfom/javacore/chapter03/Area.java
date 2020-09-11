package main.java.com.maxfom.javacore.chapter03;
/*
    Вычислить площадь круга
 */
class Area {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.9; // радиус окружности
        pi = 3.1416; // примерное число пи
        a = pi * r * r; // площадь круга по формуле

        System.out.println("Площадь круга равна " + a);
    }
}
