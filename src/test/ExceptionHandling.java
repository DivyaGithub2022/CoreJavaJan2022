package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//when we get 'element not found exception' when running in Selenium - 
		//like when the developer change some properties in the screen one day and 
		//you program does not find it and throws exception then we can fix it throwin exceptions 
		//by handling it
		//All Exceptions list available in PPT inside Live classes videos - at the end scroll down
		int num = 10;
		int array[] = {1,2,3,4};
		
		try {
			int result = num/2;
			System.out.println(array[10]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Inside Arithmetic Exception block");
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Inside ArrayIndexOutOfBoundException block");
		}catch(Exception e) {
			
			System.out.println("Inside Exception block");
		}finally {
			//will execute irrespective of exceptions thrown or not
			System.out.println("inside Finally block");
		}
		System.out.println("after try and catch");

	}

}
