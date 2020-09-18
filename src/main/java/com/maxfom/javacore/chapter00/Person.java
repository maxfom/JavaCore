package main.java.com.maxfom.javacore.chapter00;

import java.util.List;

 class Person {
    String name;
    String profession;

    public Person(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }


    public static void main(String[] args) {
        List<Person> getPersons = getPersons();

        // Программист: Вася, Петя
        // Тестировщик: Маша

    }

    private static List<Person> getPersons() {
        return List.of(
                new Person("Вася", "Программист"),
                new Person("Петя", "Тестироващик"),
                new Person("Маша", "Тестировщик")
        );
    }
}


