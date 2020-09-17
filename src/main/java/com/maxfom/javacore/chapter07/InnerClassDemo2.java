package main.java.com.maxfom.javacore.chapter07;
// Определить внутренний класс в цикле for
class OuterTest {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++)    {
            class InnerTest {
                void display() {
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            InnerTest inner = new InnerTest();
            inner.display();
        }
    }
}
public class InnerClassDemo2 {
    public static void main(String[] args) {
        OuterTest outer = new OuterTest();
        outer.test();
    }
}
