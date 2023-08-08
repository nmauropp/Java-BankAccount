package bankAccountPackage;
/**
 * Bank Account created to perform simple bank actions, as withdraw,
 * deposit and transference.
 * 
 * @author Mauro Nascimento
 */
public class Account {
	private String ownerName;
	private int number;
	private String agency;
	private double balance = 0.0;
	private Date registerDate = new Date();
	/* Class attribute */
	private static int totalAccounts;
	
	/** Account Constructor */
	Account(String ownerName) {
		Account.totalAccounts = Account.totalAccounts + 1;
		this.ownerName = ownerName;
	}
	
	/** Method to receive owner's name from current account 
	 * @returns String owner's name
	 */
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public void setOwnerName(String newName) {
		this.ownerName = newName;
	}
	
	/** Method to receive account's number 
	 * @returns int number
	 */
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int newNumber) {
		this.number = newNumber;
	}
	
	/** Method to receive balance from current account
	 * @returns boolean balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	public int getRegisteredDay() {
		return this.registerDate.day;
	}
	
	public String getRegisteredMonth() {
		return this.registerDate.month;
	}
	
	public int getRegisteredYear() {
		return this.registerDate.year;
	}
	
	public int getTotalAccounts() {
		return Account.totalAccounts;
	}
	
	public String getAllAccountData() {
		return (this.getOwnerName() + " " + this.getNumber() + " " +
					this.agency + " " + this.getBalance() + " " + this.registerDate);
	}
	
	/** Method to print current balance
	 */
	public void printBalance() {
		System.out.println(this.getOwnerName() + "'s balance is R$" +
					this.getBalance());
	}
	
	/** Method to withdraw money from the current account
	 * 
	 * @param amount
	 * @returns boolean - true if balance if greater or equal than
	 * 		amount
	 *
	 */
	public boolean withdraw(double amount) {
		if(this.getBalance() >= amount) {
			this.balance = this.balance - amount;
			System.out.println("Successful withdrawal!");
			return true;
		} else {
			System.out.println("Insuficient balance to withdraw " +
						"from " + this.getOwnerName() + "'s account.");
			return false;
		}
	}
	
	/** Method to deposit money to the current account
	 * 
	 * @param amount 
	 * @returns boolean - true if amount is greater than zero
	 */
	public boolean deposit(double amount) {
		if(amount <= 0 ) {
			System.out.println("It's not possible to deposit a"
						+ "negative or zero amount.");
			return false;
		} else {
			this.balance += amount;
			System.out.println("Successful deposit!");
			return true;
		}
	}
	
	/** Method to calculate the account's income, multiplying 
	 * the account's balance for 0.1
	 *
	 *@returns income
	 **/
	public double getIncome() {
		double income = this.getBalance() * 0.1;
		System.out.println(this.getOwnerName() + "'s income is R$" + 
					income);
		return income;
	}
	
	/** Method to transfer money from one account to another.
	 * If the account is able to withdraw, then it can transfer.
	 * 
	 *@param destination: account where the money will be deposited,
	 * amount: amount of money to be transfered.
	 * 
	 *@returns boolean: true if transference is successful or 
	 * false if not
	 **/
	public boolean transfer(Account destination, double amount) {
		if(withdraw(amount)) {
			destination.deposit(amount);
			System.out.println("Successful transference!");
			return true;
		} else {
			System.out.println("Error: transference was not " + 
						"completed");
			return false;
		}
	}
}
