package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1 = new ArrayList<String>(); //dont need to specify the size here
		arraylist1.add("Rahul"); //0 index
		arraylist1.add("Rohit"); //1 index
		arraylist1.add("Pikachu");  //2 index
		arraylist1.add("Lycan");  //3 index
		arraylist1.add("snowy");  //4 index
		arraylist1.add(null); // null value not allowed. java.lang.NullPointerException
		
		System.out.println("The size of arrayList1 is " + arraylist1.size());
		System.out.println(arraylist1);
		/*
		System.out.println("The element at 0 index " + arraylist1.get(0));
		arraylist1.remove(0); //provide the index/location
		
		System.out.println("The size of arrayList1 is " + arraylist1.size());
		System.out.println(arraylist1);
		*/
		for(int index=0;index<arraylist1.size();index++) {
			System.out.println(arraylist1.get(index));
		}
		
		System.out.println("---------------");
		
		for(int index=arraylist1.size()-1;index>=0;index--) {
			System.out.println(arraylist1.get(index));
			
		}
		System.out.println("=============");
		//For Each loop
		for (String name: arraylist1) {
			System.out.println(name);
		}
		arraylist1.add(2, "Lapras");//insert value in between
		arraylist1.set(1,"Gumshoos");
		//replace values inside array list
		
		System.out.println("----ITERATOR----");
		//ITERATOR - another way to iterate values
		Iterator<String> itr = arraylist1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Collection > SORT - will always sort in ascending order only
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);
		
		//reversing an arraylist
        Collections.sort(arraylist1, Collections.reverseOrder());
        System.out.println(arraylist1);

	}

}
