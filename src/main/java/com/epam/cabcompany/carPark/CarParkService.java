package com.epam.cabcompany.carPark;

import com.epam.cabcompany.cars.Car;

import java.util.List;

public interface CarParkService {
    void addCarToList(Car car);

    List<Car> getListOfCars();

    List<Car> getCarsWithCertainRangeOfSpeed(int maxSpeed);

    int getCarParkCost();

    List<Car> sortedCarsByFuel ();



}
