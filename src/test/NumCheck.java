package test;

import java.util.Scanner;

public class NumCheck {
	
	/*
	 * https://docs.google.com/document/d/1L_HOJUQQLTAL-XvMGUmt1_dpMLfKUguwNxQFkgnQEVg/edit
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number");
		
		int number = scanner.nextInt();
		//modular operator - module of - %
		if(number%2==0) {
			System.out.println("Even number");
		}	else {
			System.out.println("Odd number");
		}
		scanner.close(); /*occupies some space/storage in your machine RAM. 
		So it is better to close the storag function when not being used. */

	}

}
