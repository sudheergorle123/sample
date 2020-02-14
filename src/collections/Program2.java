package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList al = new LinkedList();
		//al.add(new Laptop("hp",4,1000));
		al.add(new Movie("kaidi","karthi",300000,2));
		//al.add(new Laptop("dell",6,2000));
		//al.add(null);
		LinkedList al1 = new LinkedList();
		al1.add(new Movie("bigil","karthi",300000,2));
		al.addAll(1,al1);
		//al.add(new Laptop("hp",4,1000));
		//al.add(new Laptop("hp",4,1000));
		//al.remove(new Movie("kaidi","karthi",300000,2));
		al.addFirst(new Movie("meekumc","tharun",500000,8));
		//al.addLast(new Laptop("cargo",9,900));
		//al.removeAll(al1);
		//al.retainAll(al1);
		System.out.println(al.size());
		@SuppressWarnings("rawtypes")
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(int i = 0 ; i < al.size() ; i++)
		{
			Object ob = al.get(i);
			System.out.println(ob);
			
		}
		

		

	}

}
