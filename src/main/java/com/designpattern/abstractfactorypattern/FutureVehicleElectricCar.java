package com.designpattern.abstractfactorypattern;

public class FutureVehicleElectricCar implements ElectricVehicle{
    @Override
    public void build() {
        System.out.println("Future Vehicle Electric Car");
    }
}
