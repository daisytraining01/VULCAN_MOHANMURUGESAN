package com.picnic_drill.four;

public class OopsConcepts {

	public static void main(String[] args) {
		
		Car car = new Car("Car",4,"Petrol",6,true);
		Truck truck = new Truck("Truch", 8, "Diesel", 10, true);
		
		car.display();
		truck.display();

	}

}


/***************************OUTPUT********************************/
/*

This is a Car with 4 Wheels, Which Operates in PetrolIt can accomoate6 People 
This is a Truch with 8 Wheels, Which Operates in DieselIt can carry a loaf of 10 Tones 


*/
/*****************************************************************/ 