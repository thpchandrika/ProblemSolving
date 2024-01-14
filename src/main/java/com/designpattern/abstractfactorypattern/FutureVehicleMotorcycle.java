package com.designpattern.abstractfactorypattern;

public class FutureVehicleMotorcycle implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Future Vehicle Motorcycle");
    }
}
