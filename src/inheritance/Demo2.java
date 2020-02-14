package inheritance;

public class Demo2 extends Demo1{
	int a;
	String company;
	Demo2(int a,String company)
	{
		super(28,"sudheer",78000);
		this.a = a;
		this.company = company;
		System.out.println("demo2 a ="+super.a);
		System.out.println("company ="+company);
	}
	
	
}
