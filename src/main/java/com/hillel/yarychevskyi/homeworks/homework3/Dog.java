package com.hillel.yarychevskyi.homeworks.homework3;

public class Dog extends Animal{
    private String name;
    private final int runDog = 270;
    private final int swimDog = 10;
    public static int counter;

    public static int gerCounter(){
        return counter;
    }

    public Dog(String name) {
        this.name = name;
        counter++;
    }

    @Override
    void run() {
        System.out.println(name + " running" + " " + runDog +" meters");

    }

    @Override
    void swim() {
        System.out.println(name + " swimming" + " " + swimDog + " meters");

    }
}
