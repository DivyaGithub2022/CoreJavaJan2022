package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

//HW: 30 01 2022

public class HomeworkRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence here.");
		
		String str1 = scanner.nextLine();
		
		//String str1 = "Clean World Green World";
		String str2 = " ";
		
		//System.out.println(str1.length());
		
		String[] arraywords = str1.split(" ");
		//System.out.println(arraywords[1]);
		
		LinkedHashSet<String> linkset1 = new LinkedHashSet<String>();
		//System.out.println(arraywords.length);
		
		for(int index=0;index<arraywords.length;index++) {
			
			linkset1.add(arraywords[index]);
			
		}
		System.out.println(linkset1);
		
		/*
		
		Iterator<String> itr1 = linkset1.iterator();
		
		while(itr1.hasNext()) {
			
			str2 = str2 + itr1.next().concat(" ");
			
		}
		//its treating upper/lower case difference as not duplicate
		System.out.println(str2.trim());
			*/	

	}

}
/* Chithra's logic
 * public static void main(String[] args) {
        // How to remove duplicate word from string
        String str1 = "Clean World Green World";
        HashSet<String> hs1 = new HashSet<String>();
        for (String word : str1.split(" ")) {
            hs1.add(word);
        }
        System.out.println(hs1);
    }
*/
