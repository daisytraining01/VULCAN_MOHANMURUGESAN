package com.picnic_drill.eight;


public class Calculator implements Operations{
	

	public	int add(int a,int b,int c) {
		return a+b+c;
		
	}

	public	int add(int a,int b) {
		return a+b;
		
	}
	
	
	public	int subtract(int a,int b,int c) {
		return a-b-c;
		
	}
	public	int subtract(int a,int b) {
		return a-b;
		
	}
	
	public	int Multiplication(int a,int b,int c) {
		return a*b*c;
		
	}
	public	int Multiplication(int a,int b) {
		return a*b;
		
	}
	
	
	
	public	int Division(int a,int b,int c) {
		return a/b/c;
		
	}
	public	int Division(int a,int b) {
		return a/b;
		
	}
	
	
	

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println("The Sum of 3 numbers is " + calculator.add(7, 8, 9));
		System.out.println("The Sum of 2 numbers is " + calculator.add(7,  9));
		
		System.out.println("The Difference of 3 numbers is " + calculator.subtract(7, 8, 9));
		System.out.println("The Difference of 2 numbers is " + calculator.subtract(7,  9));
		
		System.out.println("The Product of 3 numbers is " + calculator.Multiplication(7, 8, 9));
		System.out.println("The Product of 2 numbers is " + calculator.Multiplication(7,  9));
		
		System.out.println("The Division of 3 numbers is " + calculator.Division(7, 8, 9));
		System.out.println("The Division of 2 numbers is " + calculator.Division(7,  9));
		
	}

}








/***************************OUTPUT********************************/
/*

The Sum of 3 numbers is 24
The Sum of 2 numbers is 16
The Difference of 3 numbers is -10
The Difference of 2 numbers is -2
The Product of 3 numbers is 504
The Product of 2 numbers is 63
The Division of 3 numbers is 0
The Division of 2 numbers is 0



*/
/*****************************************************************/ 
