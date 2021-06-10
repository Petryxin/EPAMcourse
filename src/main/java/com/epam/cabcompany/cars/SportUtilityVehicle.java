package com.epam.cabcompany.cars;

import com.epam.cabcompany.cars.components.CarBodyStyles;
import com.epam.cabcompany.cars.components.DriveUnitType;
import com.epam.cabcompany.cars.components.Engine;
import com.epam.cabcompany.cars.components.Transmission;

public class SportUtilityVehicle extends PassengerCar {

    private int clearance;
    boolean transferCase;
    boolean lockingDifferential;
    boolean winch;

    boolean approachAngle;
    boolean departureAngle;

    public SportUtilityVehicle(MainsCarCharacteristics mainsCarCharacteristics, Engine engine, Transmission transmission,
                               DriveUnitType driveUnitType, CarBodyStyles carBodyStyles, int clearance,
                               boolean transferCase, boolean lockingDifferential, boolean winch) {
        super(mainsCarCharacteristics, engine, transmission, driveUnitType, carBodyStyles);
        this.clearance = clearance;
        this.transferCase = transferCase;
        this.lockingDifferential = lockingDifferential;
        this.winch = winch;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    public void setApproachAngle(boolean approachAngle) {
        this.approachAngle = approachAngle;
    }

    public void setDepartureAngle(boolean departureAngle) {
        this.departureAngle = departureAngle;
    }

    public int getClearance() {
        return clearance;
    }

    public boolean isTransferCase() {
        return transferCase;
    }

    public boolean isLockingDifferential() {
        return lockingDifferential;
    }

    public boolean isWinch() {
        return winch;
    }

    public boolean isApproachAngle() {
        return approachAngle;
    }

    public boolean isDepartureAngle() {
        return departureAngle;
    }
}
