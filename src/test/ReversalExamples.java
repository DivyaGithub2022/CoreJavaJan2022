package test;

public class ReversalExamples {
	
	/*
	 * https://docs.google.com/document/d/1L_HOJUQQLTAL-XvMGUmt1_dpMLfKUguwNxQFkgnQEVg/edit
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse String
		//reversal of Array
		//reversal of Number
		
		String str1 = "Green India Clean India";
		String revStr1 = "";
		
		for(int index1=str1.length()-1;index1>=0;index1--) {
			
			revStr1 = revStr1 + str1.charAt(index1);
			
		}
		
		System.out.println(revStr1);
		
		// Try reversing the words in String name = "Clean India Green India Love India";

		/*find the count of vowels present (also should consider upper case & lower case etc
				
		int result = 0;
		
		for(int index=0;index<str1.length();index++) {
			
			if(str1.charAt(index) == 'a' || str1.charAt(index) == 'e' || str1.charAt(index) == 'i' || str1.charAt(index) == 'o' || str1.charAt(index) == 'u') {
				result ++;
			}
		}
		*/
		//reversal of array
		
		int[] array = {20,30,40,50,60};
		
		//declare the array without any values / cannot declare without giving size
		int[] array2 = new int[5];
		//int[] intArray =new int[]; //Supriya mentioned this when in case of unknown size
		
		for(int index=array.length-1;index>=0;index--) {
			
			System.out.println(array[index]);
		}
		
		//reversal exercise
		
		//result = 653254
		//keep dividing the number by 10 continously using mod operator till we get all the numbers 
		
		//while loop
		
		int num5 = 452356;
		int rev = 0;
		
		while (num5>0) {
			
			int remainder = num5%10;
			rev = rev*10 + remainder;
			num5 = num5/10;
			
		}
		
		//For loop - someone from chat
		
		int n1 = 345278;
        String str3 = String.valueOf(n1);
        
        String[] str2 = str3.split("");
        int len = str2.length;
        for (int j= len-1; j>=0; j--) {
            System.out.print(str2[j]);
        }
			
			
		
	}

}
