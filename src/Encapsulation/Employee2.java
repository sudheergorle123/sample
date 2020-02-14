package Encapsulation;

public class Employee2 {
	private String name ;
	private int id;
	private int sal;
	Employee2(String name,int id,int sal)
	{
		this.name = name ;
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
	public int getsal()
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
	public void setSal(int sal)
	{
		this.sal = sal;
	}

}
