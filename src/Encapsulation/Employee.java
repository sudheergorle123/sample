package Encapsulation;

public class Employee {
	private String name;
	private int id;
	private double sal;
	Employee(String name,int id,double sal)
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getSal()
	{
		return sal;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setSal(double sal)
	{
		this.sal = sal;
	}
	
	
	

}
