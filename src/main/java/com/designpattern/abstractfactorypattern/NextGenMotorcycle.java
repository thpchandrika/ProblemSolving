package com.designpattern.abstractfactorypattern;

public class NextGenMotorcycle implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("NextGen Motorcycle");
    }
}
