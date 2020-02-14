package librariesObject;

class Sample {
	String name;
	int sal;
	int age;
	Sample(String name,int sal,int age)
	{
		this.name = name;
		this.sal = sal;
		this.age = age;
	}
	//@Override
	public String toString()
	
	{
		return "Sample[name = "+name+",sal = "+sal+",age = "+age+"]";
		
	}
	

}
