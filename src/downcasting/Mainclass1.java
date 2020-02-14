package downcasting;

public class Mainclass1 {

	public static void main(String[] args) {
		Sample1 s1 = new Sample2();
		Sample2 s2 = (Sample2)s1;
		System.out.println(s2.b);
		System.out.println(s2.ch);
		s2.pay();
		System.out.println(s1.a);
		s1.display();
		

	}

}
