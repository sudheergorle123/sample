package Exception;

import java.io.IOException;

public class Atmtransaction {
	int storedpin = 1234;
	public void transaction(int pin) throws IOException
	{
		if(pin == storedpin) {
		System.out.println("transaction successfull");	
		}
		else
		{
			throw new IOException();
		}
	}

}
