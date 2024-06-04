package com.CarSystem;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) throws Exception {

		Car car1 = new Car("101", "Venue", "Hyundai", 2021);
		Car car2 = new Car("102", "Punch", "Tata", 2022);
		Car car3 = new Car("103", "Nexon", "Tata", 2023);
		Car car4 = new Car("104", "Tigor", "Tata", 2023);
		
		Customer customer1 = new Customer("1", "rohit", "rohit@gmail.com");
		Customer customer2 = new Customer("1", "virat", "virat@gmail.com");
		
		System.out.println(car1);
		car1.rentCar();
		System.out.println(car1);
		car1.returnCar();
		System.out.println(car1);
		car2.rentCar();
		System.out.println(car2);

		try {
			car1.rentCar();
			System.out.println("Car rented successfully");
		} catch (IllegalStateException e) {
			System.out.println("Error renting car: " + e.getMessage());
		}

		// System.out.println(customer1);

		try {
			customer1.rentCar(car2);
			System.out.println("Car rented successfully");
		} catch (IllegalStateException e) {
			System.out.println("Error renting car: " + e.getMessage());
		}

		customer1.rentCar(car3);
		
		
		
		if(car1.isAvailable()) {
			System.out.println("venue is available");
		}else {
			System.out.println("Venue is rented");
		}
		
		Rented r=new Rented(car1, customer1, LocalDate.of(2024, 6, 4));
		
		
		r.returnCar(LocalDate.of(2024, 6, 6));
		
		customer2.rentCar(car4);
		System.out.println(">>"+car4);
		
		
		
		
	
		
	}
}
