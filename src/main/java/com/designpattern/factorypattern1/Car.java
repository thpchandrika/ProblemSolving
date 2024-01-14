package com.designpattern.factorypattern1;

public class Car implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("car built");
    }
}
