package com.designpattern.factorypattern1;

public class Main {
    public static void main(String[] args) {
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();
        MotorVehicle motorcycle =  motorcycleFactory.createMotorVehicle();
        motorcycle.build();
    }
}
