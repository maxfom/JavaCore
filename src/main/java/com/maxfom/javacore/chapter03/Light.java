package main.java.com.maxfom.javacore.chapter03;
/*
    Вычисляем расстояние, проходимое светом.
    Использует переменные типа long.
 */
class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 2000; // указать количество дней

        seconds = days * 24 * 60 * 60; // преобразуем в секунды

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.print(distance + " миль");
    }
}
