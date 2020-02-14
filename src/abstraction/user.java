package abstraction;

public class user {

	public static void main(String[] args) {
		AccountManager acc = new AccountManager();
		Account acc1 = acc.createAcc(1234567890,"sudheer",5000,'l');
		acc1.checkBal();
		acc1.deposit(1000);
		acc1.checkBal();
		acc1.withdraw(1000);

	}

}
