package collections;

public class Laptop {
	String brand;
	int ram;
	int memory;
	Laptop(String brand,int ram,int memory)
	{
		this.brand = brand;
		this.ram = ram;
		this.memory = memory;
	}
	@Override
	public String toString()
	{
		return "Laptop[brand ="+brand +",ram = "+ram+", memory = "+memory+" ]";
	}

}
