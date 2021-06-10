package com.epam.cabcompany;

import com.epam.cabcompany.carPark.CarPark;
import com.epam.cabcompany.cars.*;
import com.epam.cabcompany.cars.components.*;

import java.util.List;


public class Application {
    public static void main(String[] args) {

        MainsCarCharacteristics mainsCharacteristicsPeugeot = new MainsCarCharacteristics("Peugeot",
                "407", 2004, 1600,4000, 12.3,210);
        CityCar peugeot_407 = new CityCar(mainsCharacteristicsPeugeot,new Engine(), Transmission.AUTOMATIC,
                DriveUnitType.AWD, CarBodyStyles.WAGON,5,350,3,
                AirConditioningSystem.AirCondition);

        MainsCarCharacteristics mainsCharacteristicsMercedes = new MainsCarCharacteristics("Mercedes",
                "W233", 2020, 2500,100000, 12.2,300);
        BusinessCar Mercedes_W233 = new BusinessCar(mainsCharacteristicsMercedes,new Engine(), Transmission.AUTOMATIC,
                DriveUnitType.AWD, CarBodyStyles.SEDAN,true,false,true,
                PositionOfMassageSeats.RearSeatsMassage,false);

        MainsCarCharacteristics mainsCharacteristicsJeep = new MainsCarCharacteristics("Jeep",
                "Cherokee", 2019, 2700,60000, 11.1,190);
        SportUtilityVehicle Jeep_Cherokee = new SportUtilityVehicle(mainsCharacteristicsJeep,new Engine(), Transmission.AUTOMATIC,
                DriveUnitType.AWD, CarBodyStyles.SUV,25,true,true,true);

        CarPark carPark = new CarPark();
        carPark.addCarToList(peugeot_407);
        carPark.addCarToList(Mercedes_W233);
        carPark.addCarToList(Jeep_Cherokee);

        List<Car> listOfCars = carPark.getListOfCars();

        System.out.println(listOfCars);

        List<Car> carList = carPark.sortedCarsByFuel();

        System.out.println(carList);


        CabCompany cabCompany = new CabCompany("Total", carPark);


        int carParkCost = cabCompany.carParkService.getCarParkCost();
        System.out.println(carParkCost);


        List<Car> carsCertainRangeOfSpeed = cabCompany.carParkService.getCarsWithCertainRangeOfSpeed(200);

        System.out.println(carsCertainRangeOfSpeed);

        List<Car> passengerCars = cabCompany.carParkService.sortedCarsByFuel();
        System.out.println(passengerCars);

    }
}
