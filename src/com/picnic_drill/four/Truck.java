package com.picnic_drill.four;

public class Truck extends vehicle {
	
	int loadCapacityInTons;
	boolean isTankerRemovable;
	
	public Truck(String vehicleType, int numberOfWheels, String fuelType, int loadCapacityInTons,
			boolean isTankerRemovable) {
		super(vehicleType, numberOfWheels, fuelType);
		this.loadCapacityInTons = loadCapacityInTons;
		this.isTankerRemovable = isTankerRemovable;
	}
	
	
	void display() {
		System.out.println("This is a " +super.vehicleType + " with " +super.numberOfWheels+ " Wheels, Which Operates in "+super.FuelType+"It can carry a loaf of "+this.loadCapacityInTons+ " Tones ");
	}

	

}
