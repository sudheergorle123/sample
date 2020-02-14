package Exception;

import java.io.IOException;

public class Students {

	public static void main(String[] args) {
		Student3 s3 = new Student3();
		try {
		String s = s3.p();
		System.out.println(s);
		}
		catch(IOException e)
		{
			System.out.println("class is full");
		}

	}

}
