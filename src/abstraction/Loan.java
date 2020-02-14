package abstraction;

public class Loan implements Account  {
	int accno;
	String name;
	double bal;
	Loan(int accno,String name,double bal)
	{
		this.accno= accno;
		this.name = name;
		this.bal = bal;
	}
	public void checkBal()
	{
		System.out.println("amt ="+bal);
	}
	public void withdraw(double amt)
	{
		if(bal >= amt)
		{
			bal = bal + amt;
			System.out.println(bal);
		}
		else
		{
			System.out.println("insufficient bal");
		}
	}
	public void deposit(double amt)
	{
		if(bal >= amt)
		{
			bal = bal - amt;
			System.out.println(bal);
		}
		
	}

}


