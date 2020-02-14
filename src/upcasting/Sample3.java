package upcasting;

public class Sample3 {
	public void execute1(Demo1 d1)
	{
		System.out.println(d1.a);
		d1.display();
	}
	public void execute2(Demo2 d2)
	{
		System.out.println(d2.a);
		d2.display();
		System.out.println(d2.b);
		System.out.println(d2.c);
		d2.pay();
	}
	public void execute3(Demo3 d3)
	{
		System.out.println(d3.a);
		d3.display();
		System.out.println(d3.b);
		System.out.println(d3.c);
		d3.pay();
		System.out.println(d3.ch);
		System.out.println(d3.s1);
		d3.check();
		d3.msg();
	}
	public void execute4(Object ob)
	{
		System.out.println("execute object class");
	}
	
	

}
