package test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LoopsExample {
	
	/*
	 * https://docs.google.com/document/d/1L_HOJUQQLTAL-XvMGUmt1_dpMLfKUguwNxQFkgnQEVg/edit
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		scanner.close();
		
		//loop is a block of statements that will be executed repeatedly until the loop reaches the condition (here num1=10)
		
		//Print numbers from 1 to 10
		
		//While loop
		
		int num1 = 1; //declaring variable
		//condition
		while (num1 <=10) {
							
			//I dont want to pront the number 5 alone
			if(num1==5) {
				num1 = num1 + 1;
				continue;
			}
			
			System.out.println(num1);
			num1 = num1 + 1;
			
		}
		
		//For loop to print 1 to 10
		
		for(int count=1;count<=10;count++) {
			
			if(count==5) {
				continue;
			}
			
			System.out.println("Inside For loop " + count);
		}
		
		//For loop to print only 5th number
		
		for(int count=1;count<=10;count++) {
					
					if(count==5) {
						System.out.println("Inside For loop 5th number " + count);
						break;
					}
					
					
				}
		//For loop to print 10 to 1
				
		for(int count=10;count>=1;count--) {
					
					/*if(count==5) {
						continue;
					}
					*/
					System.out.println("Inside For loop " + count);
				}
				
		//Arrays with loop
		
		int[] array1 = {20, 30,40,50};
		// array length is 4 here, but the index starts from 0 to 4, no value in 5th index
		for(int index=0;index<array1.length;index++) {
			
			System.out.println("Value inside array " + array1[index]);
			
		}
		//For each loop or Enhanced For loop
		
		for(int index1:array1) {
			
			System.out.println("For each - array -" + index1);
			//no need to provide index here like array1[index], value is retrieved through 'index1'
			
		}

	}

}
