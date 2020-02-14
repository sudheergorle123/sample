package com.qspiders.libraries;
class Sample1
{
	@Override
	public String toString()
	{
		return "this is sample";
	}
}

public class ToString {

	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		String s2 = s1.toString();
		System.out.println("s2="+s2);
	}

}
