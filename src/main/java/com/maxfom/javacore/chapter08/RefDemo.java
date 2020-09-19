package main.java.com.maxfom.javacore.chapter08;
// Переменная суперкласса может ссылаться
// на объект подкласса
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        // я пробую
        ColorBox coolbox = new ColorBox(15,10,15,"Синий");
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // присвоить ссылке на объект BoxWeight ссылки на объект Box
        plainbox = weightbox;
        vol = plainbox.volume();    // верно, т.к. метод volume()
                                    // определен в классе Box
        System.out.println("Объем plainbox равен " + vol);
        System.out.println();

        // мой тест коробки
        vol = coolbox.volume();
        System.out.println("Объем моей коробки " + vol);
        System.out.println("Цвет моей коробки " + coolbox.color);
        /*  Тут ошибка в операторе, т.к. член plainbox
        не определяет член weight.
         */
        // System.out.println("Вес plainbox равен " + plainbox.weight);
    }
}
