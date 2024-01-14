package com.designpattern.abstractfactorypattern;

public class NextGenElectricCar implements ElectricVehicle{
    @Override
    public void build() {
        System.out.println("Next Gen Electric Car");
    }
}
