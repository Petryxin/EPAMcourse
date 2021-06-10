package com.epam.cabcompany.carPark;

import com.epam.cabcompany.cars.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class CarPark implements CarParkService {

    private final List<Car> listOfCars = new ArrayList<>();
    private final static Logger LOGGER = LoggerFactory.getLogger(CarPark.class);

    @Override
    public List<Car> getListOfCars(){
        LOGGER.info("Get cars list");
        return new ArrayList<>(listOfCars);
    }

    @Override
    public void addCarToList(Car car){
        if (car != null){
            listOfCars.add(car);
            LOGGER.info("add car to list");
        }else {
            LOGGER.error("car wasn't add to list");
            throw new IllegalArgumentException("List of cars shouldn't have null element");
        }
    }

    @Override
    public List<Car> getCarsWithCertainRangeOfSpeed(int maxSpeed){
        if (maxSpeed <= 0){
            throw new IllegalArgumentException("Value should be more than zero");
        }

        List<Car> carsCertainRangeOfSpeed = new ArrayList<>();
        for (Car car : listOfCars){
            if (car.getMainsCarCharacteristics().getMaxSpeed() <= maxSpeed){
                carsCertainRangeOfSpeed.add(car);
            }
        }
        LOGGER.info("get a sorted list by max speed");
        return carsCertainRangeOfSpeed;
    }

    @Override
    public int getCarParkCost(){
        int cost = 0;
        for (Car car : listOfCars){
                cost = cost + car.getMainsCarCharacteristics().getCarCost();
        }
        LOGGER.info("get cost of car park");
        return cost;
    }

    @Override
    public List<Car> sortedCarsByFuel (){
        List<Car> copyList = new ArrayList<>(listOfCars);

        Comparator<Car> comparator = Comparator.comparing(obj ->
                obj.getMainsCarCharacteristics().getFuelConsumption());

        copyList.sort(comparator);

            LOGGER.info("get a sorted list by max speed");
            return copyList;
    }
}
