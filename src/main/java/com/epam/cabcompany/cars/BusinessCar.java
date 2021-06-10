package com.epam.cabcompany.cars;

import com.epam.cabcompany.cars.components.*;

public class BusinessCar extends PassengerCar{
    private boolean satelliteConnection;
    private boolean personalDriver;
    private boolean windowTinting;
    private PositionOfMassageSeats positionOfMassageSeats;
    private boolean miniBar;

    public BusinessCar(MainsCarCharacteristics mainsCarCharacteristics, Engine engine, Transmission transmission,
                       DriveUnitType driveUnitType, CarBodyStyles carBodyStyles, boolean satelliteConnection,
                       boolean personalDriver, boolean windowTinting, PositionOfMassageSeats positionOfMassageSeats,
                       boolean miniBar) {
        super(mainsCarCharacteristics, engine, transmission, driveUnitType, carBodyStyles);
        this.satelliteConnection = satelliteConnection;
        this.personalDriver = personalDriver;
        this.windowTinting = windowTinting;
        this.positionOfMassageSeats = positionOfMassageSeats;
        this.miniBar = miniBar;
    }

    @Override
    public String toString() {
        return "Business Car:" +'\n'+
                " Car Brand=" + super.getMainsCarCharacteristics().getCarBrand() +'\n'+
                " Car Model=" + super.getMainsCarCharacteristics().getCarModel() +'\n'+
                " Fuel Consumption=" + super.getMainsCarCharacteristics().getFuelConsumption() +'\n'+
                " Satellite Connection=" + satelliteConnection +'\n'+
                " Personal Driver=" + personalDriver +'\n'+
                " Window Tinting=" + windowTinting +'\n'+
                " Position Of MassageSeats=" + positionOfMassageSeats +'\n'+
                " MiniBar=" + miniBar +
                "; "+'\n';
    }
}
