package com.hillel.yarychevskyi.homeworks.homework3;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Garfild");
        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Myxa");
        cat1.run();
        cat1.swim();
        cat2.swim();
        cat2.run();
        System.out.println();
        dog1.run();
        dog1.swim();
        dog2.run();
        dog2.swim();
        System.out.println();

        System.out.println("Кількість учасників: " + Animal.getCounterAnimal() + "\n" + "Кількість собак " + Dog.gerCounter() + "\n" + "Кількість котів " + Cat.getCounter() );

    }




}
