package com.hillel.yarychevskyi.homeworks.homework3;

public abstract class Animal {
    private static int counter;

    public static int getCounterAnimal() {
        return counter;
    }

    public Animal(){
        counter++;
    }

    abstract void run();

    abstract void swim();


}

