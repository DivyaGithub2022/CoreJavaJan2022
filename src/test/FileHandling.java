package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//IOException - when program reads from your harddrive and harddrive is absent now
//FileNotFoundException - somebody has deleted your file

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Order confirmation 123445";//how to print it in next line?
		String str2 = "Order confirmation 7898799";
		FileOutputStream file1;
		
		try {
		 
			file1 = new FileOutputStream("results.txt");
			file1.write(str1.getBytes());
			file1.write(str2.getBytes());
			
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
				
			}
		
		
	}

}
