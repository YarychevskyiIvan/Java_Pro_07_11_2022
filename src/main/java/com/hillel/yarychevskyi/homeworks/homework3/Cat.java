package com.hillel.yarychevskyi.homeworks.homework3;

public class Cat implements Running, Swimming{
    private String Name;

    public Cat(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void run() {
        System.out.println("Cat run....");

    }

    @Override
    public void swim() {

    }
}
