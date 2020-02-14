package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Bookmain {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		Book b = new Book(101,"clanguage","bala",9);
		Book b1 = new Book(109,"java","sundar",7);
		Book b2 = new Book(105,"apti","schand",19);
		Book b3 = new Book(111,"selenium","sira",29);
		Book b4 = new Book(105,"apti","schand",19);
		Book b5 = new Book(19087,"sql","harsha",906);
		pq.add(b);
		pq.add(b1);
		pq.add(b2);
		pq.add(b3);
		pq.add(b4);
		pq.add(b5);
		System.out.println("head:" +pq.peek());
		System.out.println("element:" +pq.poll());
		Iterator itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		pq.remove();
		System.out.println("after removing :");
		Iterator itr1 = pq.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("head:" +pq.peek());
		System.out.println("element:" +pq.poll());


	}

}
