package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Suraj");
		map1.put(2, "Niraj");
		map1.put(3, "Sam");
		map1.put(10, "Sam");
		//key can be integer or string as well
		//Key should be unique
		
		System.out.println(map1);
		
		//update the data in map
		map1.put(3, "Saroj");
		System.out.println(map1);
		
		//delete an entry
		//map1.remove(10, "Sam");
		map1.remove(10);
		System.out.println(map1);
		
		//iteration - entire Map values
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		}
		
		//iterate through all the Keys only
		for(Integer val : map1.keySet()) {
			
			System.out.println("Key is " + val);
			System.out.println("Value is " + map1.get(val));
		}
		
		for(String vals : map1.values()) {
			System.out.println("Values are " + vals);
		}
		
		//================================================
		//always maintain the insertion order
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer, String>();
		map2.put(1, "Suraj");
		map2.put(2, "Niraj");
		map2.put(3, "Sam");
		map2.put(10, "Sam");
		
		System.out.println(map2);
		System.out.println(map2.get(10));
		
		//================================================
		//always maintain the ascending order of the keys
		TreeMap<Integer,String> map3 = new TreeMap<Integer, String>();
		map3.put(1, "Suraj");
		map3.put(20, "Niraj");
		map3.put(3, "Sam");
		map3.put(10, "Sam");
		
		System.out.println(map3);
		

	}

}
