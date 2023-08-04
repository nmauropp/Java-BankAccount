package bankAccountPackage;
/**
 * Bank Account created to perform simple bank actions, as withdraw,
 * deposit and transference.
 * 
 * @author MauroNascimento
 */
public class Account {
	public String ownerName;
	public int number;
	public String agency;
	public double balance = 0.0;
	public String registerDate;
	
	/** Method to receive balance from current account
	 * @returns boolean balance
	 */
	public double getBalance() {
		return this.balance;
	}
	
	/** Method to print current balance
	 */
	public void printBalance() {
		System.out.println(this.ownerName + "'s balance is R$" +
					this.balance);
	}
	
	/** Method to withdraw money from the current account
	 * 
	 * @param amount
	 * @returns boolean - true if balance if greater or equal than
	 * amount
	 */
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			System.out.println("Successful withdrawal!");
			return true;
		} else {
			System.out.println("Insuficient balance to withdraw " +
						"from " + this.ownerName + "'s Account.");
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
		double income = this.balance * 0.1;
		System.out.println(this.ownerName + "'s income is R$" + 
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
