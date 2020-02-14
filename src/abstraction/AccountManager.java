package abstraction;

public class AccountManager {
	public Account createAcc(int Accno,String name,double bal,char ch) {
		if(ch == 's')
			
		{
			return new Savings(1234567890,"sudheer",5000);
		}
		else
		{
			return new Loan(987654321,"",5000);
		}
		
	}

}
