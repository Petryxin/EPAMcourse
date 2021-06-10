package com.epam.cabcompany.cars;

import com.epam.cabcompany.cars.components.*;

public class CityCar extends PassengerCar {
    private int numberOfSeats;
    private int luggageCompartmentVolume;
    private int safetyLevel;
    private AirConditioningSystem airConditioningSystem;


    public CityCar(MainsCarCharacteristics mainsCarCharacteristics, Engine engine, Transmission transmission,
                   DriveUnitType driveUnitType, CarBodyStyles carBodyStyles, int numberOfSeats,
                   int luggageCompartmentVolume, int safetyLevel, AirConditioningSystem airConditioningSystem) {
        super(mainsCarCharacteristics, engine, transmission, driveUnitType, carBodyStyles);
        this.numberOfSeats = numberOfSeats;
        this.luggageCompartmentVolume = luggageCompartmentVolume;
        this.safetyLevel = safetyLevel;
        this.airConditioningSystem = airConditioningSystem;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getLuggageCompartmentVolume() {
        return luggageCompartmentVolume;
    }

    public int getSafetyLevel() {
        return safetyLevel;
    }

    public AirConditioningSystem getAirConditioningSystem() {
        return airConditioningSystem;
    }

    @Override
    public String toString() {
        return "City Car:" +'\n'+
                " Car Brand=" + super.getMainsCarCharacteristics().getCarBrand() +'\n'+
                " Car Model=" + super.getMainsCarCharacteristics().getCarModel() +'\n'+
                " Fuel Consumption=" + super.getMainsCarCharacteristics().getFuelConsumption() +'\n'+
                " Number Of Seats=" + numberOfSeats +'\n'+
                " Luggage Compartment Volume=" + luggageCompartmentVolume +'\n'+
                " Safety Level=" + safetyLevel +'\n'+
                " Air Conditioning System=" + airConditioningSystem +
                "; "+'\n';
    }
}
