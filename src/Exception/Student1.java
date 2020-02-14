package Exception;


import java.io.IOException;

public class Student1 {
	public void m() throws IOException
	{
		System.out.println("first bencher");
		throw new IOException();
	}
}
