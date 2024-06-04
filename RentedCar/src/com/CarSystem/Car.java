package com.CarSystem;

public class Car {
	private final String licensePlate;
    private final String model;
    private final String brand;
    private final int year;
    private boolean available;

    public Car(String licensePlate, String model, String brand, int year) throws IllegalArgumentException {
        if (licensePlate == null || licensePlate.isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be null or empty");
        }
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive number");
        }

        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.available = true; 
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentCar() {
        if (!available) {
            throw new IllegalStateException("Car is already rented");
        }
        available = false;
    }

    public void returnCar() {
        if (available) {
            throw new IllegalStateException("Car is already available");
        }
        available = true;
    }

    @Override
    public String toString() {
        return year + " " + brand + " " + model + " (" + (available ? "Available" : "Rented") + ")";
    }

}
