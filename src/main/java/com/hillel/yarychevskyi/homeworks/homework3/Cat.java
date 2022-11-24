package com.hillel.yarychevskyi.homeworks.homework3;

public class Cat extends Animal{
    private String name;
    private int runCat = 180;
    public static int counter;

    public static int getCounter(){
        return counter;
    }

    public Cat(String name) {
        this.name = name;
        counter++;
    }

    @Override
    void run() {
        System.out.println(name + " running" + " " + runCat + " metres");

    }

    @Override
    void swim() {
        System.out.println("cat can not swim");

    }
}
