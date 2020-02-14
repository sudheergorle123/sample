package collections;

public class Bike {
	int regno;
	String brand;
	int cc;
	Bike(int regno,String brand,int cc)
	{
		this.regno = regno;
		this.brand = brand;
		this.cc = cc;
	}
	public String toString()
	{
		return "Bike[regno = "+regno+",brand = "+brand+",cc = "+cc+"]";
	}
	public int hashCode()
	{
		return regno;
	}
	public boolean equals(Object ob)
	{	
		
		Bike bt = (Bike)ob;
		return this.regno == bt.regno;
	}

}
