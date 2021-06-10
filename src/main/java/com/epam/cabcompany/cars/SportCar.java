package com.epam.cabcompany.cars;

import com.epam.cabcompany.cars.components.CarBodyStyles;
import com.epam.cabcompany.cars.components.DriveUnitType;
import com.epam.cabcompany.cars.components.Engine;
import com.epam.cabcompany.cars.components.Transmission;

public class SportCar extends PassengerCar {


    private boolean launchControl;

    public SportCar(MainsCarCharacteristics mainsCarCharacteristics, Engine engine, Transmission transmission,
                    DriveUnitType driveUnitType, CarBodyStyles carBodyStyles, boolean launchControl) {
        super(mainsCarCharacteristics, engine, transmission, driveUnitType, carBodyStyles);
        this.launchControl = launchControl;
    }

    public boolean isLaunchControl() {
        return launchControl;
    }
}
