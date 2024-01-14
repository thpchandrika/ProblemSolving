package com.designpattern.abstractfactorypattern;

public class Main {
    public static void main(String[] args) {
        NextGenCorporation nextGenCorporation = new NextGenCorporation();
        FutureVehicleCorporation futureVehicleCorporation = new FutureVehicleCorporation();
        nextGenCorporation.createElectricVehicle().build();
        nextGenCorporation.createMotorVehicle().build();

        futureVehicleCorporation.createElectricVehicle().build();
        futureVehicleCorporation.createMotorVehicle().build();
    }
}
