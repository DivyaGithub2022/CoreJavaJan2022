package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("John");
		set1.add("Jess");
		set1.add("Jack");
		set1.add("John");//duplicate values not displayed
		set1.add("Jill");
		set1.add(null);
		
		System.out.println("Hashset -- " + set1);
		
		/*
		set1.add("name1");
		set1.add("name2");
		set1.add("name3");
		set1.add("name4");
		
		System.out.println(set1);
		*/
		
		//no direct method to get data
		//iterator<string> i =set.iterator();  -- need to check
		//(String name: hs1)  for loop
		
		LinkedHashSet<String> linkset1 = new LinkedHashSet<String>();
		//always maintains the order in the way its inserted
		linkset1.add("John");
		linkset1.add("Tom");
		linkset1.add("Jess");
		linkset1.add("John");//duplicate values not displayed
		linkset1.add("Jack");
		linkset1.add("Jill");
		linkset1.add(null);
		
		System.out.println("linkset1 -- " + linkset1);
		
		System.out.println("----Iterator----");
		Iterator<String> itr1 = linkset1.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		};
		
		TreeSet<String> treeset1 = new TreeSet<String>();
		
		treeset1.add("John");
		treeset1.add("Tom");
		treeset1.add("Jess");
		treeset1.add("John");//duplicate values not displayed
		treeset1.add("Jack");
		treeset1.add("Jill");
		//treeset1.add(null); -- null is not allowed in TreeSet
		
		System.out.println("treeset1 -- " + treeset1);

	}

}
