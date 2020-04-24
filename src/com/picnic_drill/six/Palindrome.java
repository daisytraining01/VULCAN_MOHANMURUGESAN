package com.picnic_drill.six;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the text to check for palindrome");
		String str = scanner.nextLine();
		System.out.print("The Given String "+str+" is ");
		if(checkPalindrome(str)) {
			System.out.print("Palinrome");
		}else {
			System.out.print("Not Palinrome");
		}
		
		scanner.close();
	}
	
	public static boolean checkPalindrome(String s) {
		
		char ch[] = s.toCharArray();

		int j = s.length() - 1;

		for(int i=0;i<s.length();i++)
		{
			
			if(ch[i] == ch[j]) {
				j--;
				continue;
				
			}else {
				return false;
			}
			
		}
		
		
		return true;
	}
	
}




/***************************OUTPUT********************************/
/*

Enter the text to check for palindrome
appa
The Given String appa is Palinrome

Enter the text to check for palindrome
mohan
The Given String mohan is Not Palinrome



*/
/*****************************************************************/ 
