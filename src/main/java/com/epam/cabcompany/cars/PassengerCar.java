package com.epam.cabcompany.cars;

import com.epam.cabcompany.cars.components.CarBodyStyles;
import com.epam.cabcompany.cars.components.DriveUnitType;
import com.epam.cabcompany.cars.components.Engine;
import com.epam.cabcompany.cars.components.Transmission;

public class PassengerCar extends Car {
    private CarBodyStyles carBodyStyles;


    public PassengerCar(MainsCarCharacteristics mainsCarCharacteristics, Engine engine, Transmission transmission,
                        DriveUnitType driveUnitType, CarBodyStyles carBodyStyles) {
        super(mainsCarCharacteristics, engine, transmission, driveUnitType);
        this.carBodyStyles = carBodyStyles;
    }

    public CarBodyStyles getCarBodyStyles() {
        return carBodyStyles;
    }

}
