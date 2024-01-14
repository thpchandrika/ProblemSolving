package com.designpattern.factorypattern1;

public class CarFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
