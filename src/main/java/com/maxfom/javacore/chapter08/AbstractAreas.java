package main.java.com.maxfom.javacore.chapter08;
// Абстрактные методы и классы
abstract class FigureTest {
    double dim1;
    double dim2;
    FigureTest(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // теперь метод area() является абстрактным
    abstract double area();
}

class RectangleTest extends FigureTest {
    RectangleTest(double a, double b) {
        super(a, b);
    }

    // переопределить метод для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
 }

 class TriangleTest extends FigureTest {
    TriangleTest(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для прямоугольного треугольника
     double area() {
         System.out.println("В области треугольника.");
         return dim1 * dim2 / 2;
     }
 }

public class AbstractAreas {
    public static void main(String[] args) {
        // FigureTest f = new FigureTest(10,10); // нельзя, тк. абстрактный класс
        RectangleTest r = new RectangleTest(10, 10);
        TriangleTest t = new TriangleTest(9,5);
        FigureTest fugure; // верно, но объекьт не создается, т к абстрактный класс

        fugure = r;
        System.out.println("Площадь равна " + fugure.area());

        fugure = t;
        System.out.println("Площадь равна " + fugure.area());
    }
}
