package com.hillel.yarychevskyi.homeworks.homework2;

public class Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }





    public void start () {
     startElectricity();
     startCommand();
     startFuelSystem();
     

    }

    private void startElectricity() {
        System.out.println("Electricity turns ON....");
    }

    private void startCommand() {
        System.out.println("Command turns ON.....");
    }

    private void startFuelSystem() {
        System.out.println("FuelSystem working.....");
    }


}
