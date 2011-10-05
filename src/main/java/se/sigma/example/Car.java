package se.sigma.example;

public class Car {
    private Integer fuelLevel;

    public Car(int initialFuelLevel) {
        fuelLevel = initialFuelLevel;
    }

    public void addFuel(int addedFuel) {
        fuelLevel = fuelLevel + addedFuel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}