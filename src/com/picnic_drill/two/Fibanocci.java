package com.picnic_drill.two;

public class Fibanocci {


	public static void main(String[] args) {
		
		printFibanocci(13);
		

	}
	public static	void printFibanocci(int number) {
		int a = 1, b = 1, temp;
		System.out.println("Fibanocci Series");
		for(int i =0 ;a<=number; i++) {
			System.out.print(a + " ");
			temp = a;
			a=b;
			b= temp + b;
			
		}
		
	}

}


/***************************OUTPUT********************************/
/*

Fibanocci Series
1 1 2 3 5 8 13 


*/
/*****************************************************************/ 