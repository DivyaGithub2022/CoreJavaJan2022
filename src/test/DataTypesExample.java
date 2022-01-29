package test;

public class DataTypesExample {
	
	/*
	 * https://docs.google.com/document/d/1L_HOJUQQLTAL-XvMGUmt1_dpMLfKUguwNxQFkgnQEVg/edit
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 30;
		
		//Arithmetic operators
		//subtraction -
		//multiplication *
		//Division /
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		//to store decimal digits - Float
		float div = (float) num1 / num2; //Type casting -to convert int values to Float
		
		//String result = "The sum of two numbers is " + sum;
		//System.out.println(result);
		
		System.out.println("The sum of two numbers is " + sum);
		System.out.println("The difference of two numbers is " + sub);
		System.out.println("The multiplication of two numbers is " + mul);
		System.out.println("The division of two numbers is " + div);
			
		String name = "Clean India Green India";
		//to find the no. of characters in the string - length function
		//String values always to be given inside doublt quotes "
		
		System.out.println("Total num of characters are " + name.length());
		
		//to find the char at a particular position in a string
		char char1 = name.charAt(0);
		System.out.println("character at first place " + char1);
		
		//to find the last char
		char char2 = name.charAt(name.length() -1);
		System.out.println("character at last place " + char2);
		
		//convert string to uppercase and lowercase
		System.out.println("The string in uppercase " + name.toUpperCase());
		System.out.println("The string in uppercase " + name.toLowerCase());

	}

}
