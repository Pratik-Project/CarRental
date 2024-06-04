package com.CarSystem;

import java.time.LocalDate;

public class Rented  {
	
	    private final Car car;
	    private final Customer customer;
	    private final LocalDate rentalDate;
	    private LocalDate returnDate;

	    public Rented(Car car, Customer customer, LocalDate rentalDate) throws IllegalArgumentException {
	        if (rentalDate.isAfter(LocalDate.now())) {
	            throw new IllegalArgumentException("Rental date cannot be in the future");
	        }
	        this.car = car;
	        this.customer = customer;
	        this.rentalDate = rentalDate;
	        car.rentCar();
	    }
	    
	        public void returnCar(LocalDate returnDate) throws IllegalArgumentException {
	            if (returnDate.isBefore(rentalDate)) {
	                throw new IllegalArgumentException("Return date cannot be before rental date");
	            }
	            this.returnDate = returnDate;
	            car.returnCar(); 
	            customer.returnCar(car); 
	        }
	        
	        public Car getCar() {
	            return car;
	        }

	        public Customer getCustomer() {
	            return customer;
	        }

	        public LocalDate getRentalDate() {
	            return rentalDate;
	        }

	        public LocalDate getReturnDate() {
	            return returnDate;
	        }
	        
	    }
