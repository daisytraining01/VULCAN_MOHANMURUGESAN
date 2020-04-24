package com.picnic_drill.four;

public class Car extends vehicle {
	
	int NumberOfSeats;
	boolean isAuioSystemAvailable;

	

	public Car(String vehicleType, int numberOfWheels, String fuelType, int numberOfSeats,
			boolean isAuioSystemAvailable) {
		super(vehicleType, numberOfWheels, fuelType);
		NumberOfSeats = numberOfSeats;
		this.isAuioSystemAvailable = isAuioSystemAvailable;
	}
	
	void display() {
		System.out.println("This is a " +super.vehicleType + " with " +super.numberOfWheels+ " Wheels, Which Operates in "+super.FuelType+"It can accomoate"+this.NumberOfSeats+ " People ");
	}

	
	
	

}
