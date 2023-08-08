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
	
	public static void testDate(Account c1) {
		System.out.println("The Account is registered since: " + c1.registerDate.month +
					"/" + c1.registerDate.day + "/" + c1.registerDate.year);
	}
	
	public static void main (String[] args) {
		Account c1;
		
		c1 = new Account();
		c1.ownerName = "Mauro";
		c1.balance = 500;
		
		testDate(c1);
		
	}
}
