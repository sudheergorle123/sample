package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Proirity {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("arjun");
		pq.add("suryaprakash");
		pq.add("sudheer");
		pq.add("jagan");
		pq.add("ish");
		pq.add("zombie");
		pq.add("bagath");
		pq.add("suryaprakash");

		System.out.println("head:" +pq.peek());
		System.out.println("element:"+pq.element());
		@SuppressWarnings("rawtypes")
		Iterator itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		pq.remove();
		pq.poll();
		System.out.println("after removing:");
		Iterator<String> itr1 = pq.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

	}

}
