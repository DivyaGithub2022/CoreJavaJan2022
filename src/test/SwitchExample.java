package test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str1 = "Green World Clean World";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence here -");
		
		String str1 = scanner.nextLine();
		
		int vowelCount = 0;
		
		for (int index=0;index<str1.length();index++) {
			
			char temp = str1.charAt(index);
			
			switch(temp) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelCount++;
				break;
				
			default:
				System.out.println("Inside default");
			}
			
		}
		System.out.println("Total count of vowels is " + vowelCount);
		scanner.close();

	}

}
