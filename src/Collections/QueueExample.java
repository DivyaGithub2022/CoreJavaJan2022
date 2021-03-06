package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Rimy");
		pq1.add("Ron");
		pq1.add("Jen");
		pq1.add("Lisa");
		pq1.add("Jen");//duplicate values
		//pq1.add(null); -- java.lang.NullPointerException
		
		System.out.println(pq1);
		
		System.out.println("First value: " + pq1.peek());
		System.out.println("First value: " + pq1.poll());//retrieves but removes the value as well
		
		System.out.println(pq1);
		System.out.println("-----");
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>(); //order is maintained
		
		dq1.add("Rimy");
		dq1.add("Ron");
		dq1.add("Jess");
		dq1.add("Jen");//duplicate values
		dq1.add("Lisa");
		
		//dq1.add(null); -- java.lang.NullPointerException
		dq1.add("Jen");
		
		System.out.println(dq1.peek());
		//System.out.println(dq1.peekFirst());//this not there in PriorityQueue
		System.out.println(dq1.peekLast());//this not there in PriorityQueue
		System.out.println("dequePEEK--- " + dq1);
		
		System.out.println(dq1.poll());
		//System.out.println(dq1.pollFirst());//this not there in PriorityQueue
		//System.out.println(dq1.pollLast());//this not there in PriorityQueue
		System.out.println("dequePOLL--- " + dq1);

	}

}
