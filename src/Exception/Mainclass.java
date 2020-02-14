package Exception;

import java.io.IOException;

public class Mainclass {

	public static void main(String[] args) {
		Atmtransaction at = new Atmtransaction();
		try
		{
			at.transaction(000);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("hey collect cash");
		}
		

	}

}
