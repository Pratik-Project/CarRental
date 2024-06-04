package com.CarSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	    private final String customerId;
	    private final String name;
	    private final String email;
	    private Car rentedCars;


	    public Customer(String customerId, String name, String email) throws IllegalArgumentException {
	        if (customerId == null || customerId.isEmpty()) {
	            throw new IllegalArgumentException("Customer ID cannot be null or empty");
	        }
	        if (!email.contains("@")) {
	            throw new IllegalArgumentException("Email must contain '@'");
	        }
	        this.customerId = customerId;
	        this.name = name;
	        this.email = email;
	        
	        this.rentedCars = null; 
	    }

	    public String getCustomerId() {
	        return customerId;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	   

	    public void rentCar(Car car) throws IllegalStateException {
	        if (rentedCars != null) {
	            throw new IllegalStateException("Car already rented by this customer");
	        }
	        if (!car.isAvailable()) {
	            throw new IllegalStateException("Car is not available for rent");
	        }
	        car.rentCar();
	        rentedCars = car;
	    }

	    public void returnCar(Car car) throws IllegalStateException {
	        if (rentedCars == null || rentedCars != car) {
	            throw new IllegalStateException("Car is not rented by this customer");
	        }
	        car.returnCar();
	        rentedCars = null;
	    }	

}
