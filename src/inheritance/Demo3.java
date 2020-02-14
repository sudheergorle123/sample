package inheritance;

public class Demo3 extends Demo2{
	String giname;
	String addres;
	Demo3(String giname,String addres)
	{
		super(89,"infosys");
		this.giname = giname;
		this.addres = addres;
		System.out.println("giname ="+giname);
		System.out.println("addres ="+addres);
		
	}
	
	

}
