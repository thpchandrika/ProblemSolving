package com.designpattern.factorypattern1;

public class Motorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("motorcycle built");
    }
}
