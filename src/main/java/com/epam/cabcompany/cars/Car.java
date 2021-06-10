package com.epam.cabcompany.cars;


import com.epam.cabcompany.cars.components.DriveUnitType;
import com.epam.cabcompany.cars.components.Engine;
import com.epam.cabcompany.cars.components.Transmission;


public class Car{

    private MainsCarCharacteristics mainsCarCharacteristics;
    private Engine engine;
    private Transmission transmission;
    private DriveUnitType driveUnitType;

    public Car(MainsCarCharacteristics mainsCarCharacteristics, Engine engine, Transmission transmission, DriveUnitType driveUnitType) {
        this.mainsCarCharacteristics = mainsCarCharacteristics;
        this.engine = engine;
        this.transmission = transmission;
        this.driveUnitType = driveUnitType;
    }

    public MainsCarCharacteristics getMainsCarCharacteristics() {
        return mainsCarCharacteristics;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public DriveUnitType getDriveUnitType() {
        return driveUnitType;
    }
}
