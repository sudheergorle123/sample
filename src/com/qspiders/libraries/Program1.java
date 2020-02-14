package com.qspiders.libraries;
class Sample 
{
	public int hashCode()
	{
		return 10;
	}
	
}

public class Program1 {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		String s2 = s1.toString();
		int s3= s1.hashCode();
		System.out.println("s1.toString()="+s2);
		System.out.println("s1.hashCode()="+s3);

	}

}
