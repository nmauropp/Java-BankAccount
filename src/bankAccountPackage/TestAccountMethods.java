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
		System.out.println(c1.getOwnerName() + "'s account is registered since: " + c1.getRegisteredMonth() +
					"/" + c1.getRegisteredDay() + "/" + c1.getRegisteredYear());
	}
	
	public static void testAccountQuantity(Account c1) {
		System.out.println("The amount of accounts registered is " + c1.getTotalAccounts());
	}
	
	public static void main (String[] args) {
		Account c1;
		Account c2;
		Account c3;
		
		c1 = new Account();
		c1.setOwnerName("Mauro");
		c1.deposit(500);
		
		testDate(c1);
		
		c2 = new Account("Jose");
		c3 = new Account("Maria");
		testAccountQuantity(c1);
		System.out.println(c1.getOwnerName() + ": " + c1.getId());
		System.out.println(c2.getOwnerName() + ": " + c2.getId());
		
		
		
	}
}
