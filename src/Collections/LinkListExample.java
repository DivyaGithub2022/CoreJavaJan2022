package Collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Pikachu");
		list1.add("Toge");
		list1.add("Popplio");
		list1.add("Pikachu");
		list1.add(null);
		
		list1.addFirst("Alolan Island");
		list1.addLast("Ditto");
				
		System.out.println(list1);
		
		list1.add(1, "Lapras");
		System.out.println(list1);
		
		for(int index=0;index<list1.size();index++) {
			System.out.println(list1.get(index));
		}
	}

}
