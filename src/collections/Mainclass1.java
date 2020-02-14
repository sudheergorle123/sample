package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Mainclass1 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(new State(8901234567L,86,9800));
		al.add(new College(10,9000,70));
		al.add(new College(8,860,98));
		al.add(new State(8901234567L,86,9800));
		al.add(new State(12345678L,10,900));
		al.add(new College(9,9000,80));
		al.add(new State(8901234567L,86,9800));
		al.add(null);
		al.add("java");
		al.add(1,"testing");
		ArrayList al1 = new ArrayList();
		al1.add("sudheer");
		al1.add(new College(3,800,90));
		al.add(1,al1);
		//al.removeAll(al1);
		//al.remove(al1);
		al1.clear();
		al.retainAll(al1);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())	
		{
			System.out.println(itr.next());
		}
		

	}

}
