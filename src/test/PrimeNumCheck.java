package test;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int primenum = scanner.nextInt();
		
		boolean flag = true;
		
		int index;
		for(index=2;index<primenum/2;index++) {
			// to optimize the logic make "primenum/2"
			//for(index=2;index<primenum/2;index++)
			int temp = primenum%index;
			if(temp == 0) {
				
				flag = false;
				break;
			}
			
		}
		
		if(flag == true) {
			
			System.out.println("this is a prime number");
			}
		else {
			System.out.println("this is not a prime number");
			
		}
		scanner.close();

	} //another logic
	/*
	 * for(int i=0;i<str.length();i++)
        {
            char temp=str.toUpperCase().charAt(i);
            switch(temp)
            {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':    
                count=count+1;
                break;
            }
                
            }
	 */

}
