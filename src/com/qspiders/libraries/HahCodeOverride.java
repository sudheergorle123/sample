package com.qspiders.libraries;
class Sample4
{
	@Override
	public int hashCode()
	{
		return 6789;
	}
}

public class HahCodeOverride {
	public static void main(String[]args)
	{
	Sample4 s = new Sample4();
	int hc1 = s.hashCode();
	System.out.println(hc1);
	}

}
