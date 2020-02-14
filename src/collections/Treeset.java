package collections;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		Actor ac1 = new Actor("vijay",100,30000);
		Actor ac2 = new Actor("chiru",1,90000);
		Actor ac3 = new Actor("mahesh",10,50000);
		Actor ac4 = new Actor("ntr",3,80000);
		Actor ac5 = new Actor("ram",89,35000);
		Actor ac6 = new Actor("ram",89,35000);
		ts.add(ac1);
		ts.add(ac2);
		ts.add(ac3);
		ts.add(ac4);
		ts.add(ac5);
		for(Object s : ts)
		{
			System.out.println(s);
		}
		
		
				
		

	}

}
