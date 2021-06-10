package com.epam.cabcompany;

import com.epam.cabcompany.carPark.CarPark;
import com.epam.cabcompany.cars.*;
import com.epam.cabcompany.cars.components.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;


import java.util.List;
import java.util.stream.Stream;

public class CarParkTest {

    private static CarPark carPark;

    @BeforeAll
    public static void init(){
        MainsCarCharacteristics mainsCharacteristicsPeugeot = new MainsCarCharacteristics("Peugeot",
                "407", 2004, 1600,4000, 12.5,210);
        CityCar peugeot_407 = new CityCar(mainsCharacteristicsPeugeot,new Engine(), Transmission.AUTOMATIC,
                DriveUnitType.AWD, CarBodyStyles.WAGON,5,350,3,
                AirConditioningSystem.AirCondition);

        MainsCarCharacteristics mainsCharacteristicsMercedes = new MainsCarCharacteristics("Mercedes",
                "W233", 2020, 2500,100000, 11,300);
        BusinessCar Mercedes_W233 = new BusinessCar(mainsCharacteristicsMercedes,new Engine(), Transmission.AUTOMATIC,
                DriveUnitType.AWD, CarBodyStyles.SEDAN,true,false,true,
                PositionOfMassageSeats.RearSeatsMassage,false);

        MainsCarCharacteristics mainsCharacteristicsJeep = new MainsCarCharacteristics("Jeep",
                "Cherokee", 2019, 2700,60000, 12.3,190);
        SportUtilityVehicle Jeep_Cherokee = new SportUtilityVehicle(mainsCharacteristicsJeep,new Engine(), Transmission.AUTOMATIC,
                DriveUnitType.AWD, CarBodyStyles.SUV,25,true,true,true);

        carPark = new CarPark();
        carPark.addCarToList(peugeot_407);
        carPark.addCarToList(Mercedes_W233);
        carPark.addCarToList(Jeep_Cherokee);

    }

    @Test
    public void addCarToList_shouldThrowExceptionOnNull(){
        Assertions.assertThrows(IllegalArgumentException.class,()->carPark.addCarToList(null));
    }

    @Test
    public void addCarToList(){
        Car car = Mockito.mock(Car.class);
        CarPark carPark1 = new CarPark();
        carPark1.addCarToList(car);

        Assertions.assertEquals(1,carPark1.getListOfCars().size());
    }

    @Test
    public void getListOfCars(){
        List<Car> copyListOfCars = carPark.getListOfCars();
        Assertions.assertEquals(carPark.getListOfCars(),copyListOfCars);

    }

    @Test
    public void getCarsCertainRangeOfSpeed_shouldThrowExceptionOnLessThan0(){
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> carPark.getCarsWithCertainRangeOfSpeed(-100));
    }

    @Test
    public void getCarsCertainRangeOfSpeed_shouldThrowExceptionOnEquals0(){

        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> carPark.getCarsWithCertainRangeOfSpeed(0));
    }

    @ParameterizedTest
    @MethodSource("getMaxSpeed")
    public void getCarsCertainRangeOfSpeed(int maxSpeed, int sizeOfCarList){
        int actualSizeOfCarList = carPark.getCarsWithCertainRangeOfSpeed(maxSpeed).size();
        Assertions.assertEquals(sizeOfCarList, actualSizeOfCarList);
    }
    public static Stream<Arguments> getMaxSpeed(){
        return Stream.of(
                Arguments.of(200, 1),
                Arguments.of(220, 2)
        );
    }

    @Test
    public void getCarParkCost(){
        Assertions.assertEquals(164000,carPark.getCarParkCost());
    }

    @Test
    public void sortedCarsByFuel(){
        List<Car> carList = carPark.sortedCarsByFuel();

        Assertions.assertEquals(11, carList.get(0)
                .getMainsCarCharacteristics().getFuelConsumption());
        Assertions.assertEquals(12.3, carList.get(1)
                .getMainsCarCharacteristics().getFuelConsumption());
        Assertions.assertEquals(12.5, carList.get(2)
                .getMainsCarCharacteristics().getFuelConsumption());
    }
}
