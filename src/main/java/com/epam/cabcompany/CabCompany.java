package com.epam.cabcompany;

import com.epam.cabcompany.carPark.CarParkService;

public class CabCompany {
    private String nameCabCompany;
    CarParkService carParkService;

    public CabCompany(String nameCabCompany, CarParkService carParkService) {
        this.nameCabCompany = nameCabCompany;
        this.carParkService = carParkService;

    }

    public String getNameCabCompany() {
        return nameCabCompany;
    }

}
