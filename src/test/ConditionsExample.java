package test;

import java.util.Scanner;

public class ConditionsExample {
	
	/*
	 * https://docs.google.com/document/d/1L_HOJUQQLTAL-XvMGUmt1_dpMLfKUguwNxQFkgnQEVg/edit
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to get input from user using Scanner class
		//create an object of Scanner class
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the Age.");
		int age = scanner.nextInt();
		
		if(age>17) {
			System.out.println("You are eligible for voting.");
		} else if(age==17) { 
			//to check condition (comparison operator) use '==' and '=' for assiging values
			System.out.println("You will be eligible for voting next year only.");
		} else {
			int eligibleYear = 18 - age;
			System.out.println("You are not eligible for voting this year. Try after " + eligibleYear + " years");
		}
		scanner.close();

	}

}
