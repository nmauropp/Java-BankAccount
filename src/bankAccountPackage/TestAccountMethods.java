package bankAccountPackage;
public class TestAccountMethods {
	
	public void withdraw(Account c1) {
		c1.printBalance(); // print initial balances
		c1.withdraw(200); // withdraw test
		c1.printBalance(); // print balances after withdraw
	}
	
	public void deposit(Account c1) {
		c1.printBalance();
		c1.deposit(40); // deposit test
		c1.printBalance(); // print balances after deposit
	}
	
	public static void main (String[] args) {
		Account c1;
		Account c2;
		
		c1 = new Account();
		c1.ownerName = "Mauro";
		c1.balance = 500;
		
		c2 = new Account();
		c2.ownerName = "Jose";
		c2.balance = 1000;
		
		c1.printBalance();
		c2.printBalance();
		c1.transfer(c2, 1000);
		c1.printBalance();
		c2.printBalance();
		
	}
}
