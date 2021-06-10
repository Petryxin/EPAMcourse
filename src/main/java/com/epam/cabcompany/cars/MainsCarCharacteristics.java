package com.epam.cabcompany.cars;

public class MainsCarCharacteristics {
    private String carBrand;
    private String carModel;
    private int yearOfCarProduction;
    private int weight;
    private int carCost;
    private double fuelConsumption;
    private int MaxSpeed;

    public MainsCarCharacteristics(String carBrand, String carModel, int yearOfCarProduction,
                                   int weight, int carCost, double fuelConsumption, int maxSpeed) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfCarProduction = yearOfCarProduction;
        this.weight = weight;
        this.carCost = carCost;
        this.fuelConsumption = fuelConsumption;
        MaxSpeed = maxSpeed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYearOfCarProduction() {
        return yearOfCarProduction;
    }

    public int getWeight() {
        return weight;
    }

    public int getCarCost() {
        return carCost;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }
}
