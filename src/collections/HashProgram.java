package collections;

import java.util.HashSet;

public class HashProgram {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Bike(1234,"ktm",456));
		hs.add(new Bike(145,"duke",890));
		hs.add(new Bike(1234,"duke",567));
		hs.add(new Bike(678,"duke",567));
		hs.add(new Bike(890,"duke",567));
		hs.add(new Bike(1234,"duke",567));
		hs.add(new Bike(0, null, 0));

		
		for(Object ob : hs)
		{
			System.out.println(ob);
		}
		

	}

}
