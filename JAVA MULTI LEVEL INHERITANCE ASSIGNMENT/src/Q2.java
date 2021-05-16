/* Create a class named “Account” with the two properties (customer_name & account_no)
 * and a method named “display()” that prints its properties. 
 */

class Account{
	final private String customer_name;
	final private int account_no;
	
	Account(String customer_name, int account_no){
		this.customer_name = customer_name;
		this.account_no = account_no;
	}
	
	// Getters to get Customer name and account number
	public String getCustomerName() {
		return customer_name;
	}
	
	public int getAccountNo() {
		return account_no;
	}
	
	public void display() {
		System.out.println("\nThe Customer Name is: "+this.getCustomerName()+" with Account Number: "+this.getAccountNo());
	}
}

/* Create another class named
 * “Saving_Account” that extends the “Account” class and inherits its properties. This class
 * also has two properties(min_bal & saving_bal) and a method named “display()” which
 * prints all four properties.
 */

class Saving_Account extends Account {
	private double min_bal;
	private double saving_bal;
	
	Saving_Account(String customer_name, int account_no, double min_bal, double saving_bal){
		super(customer_name, account_no );
		
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;
		
	}
	
	public void setMinBal(double min_bal) {
		this.min_bal = min_bal;
	}
	
	public void setSavBal(double saving_bal) {
		this.saving_bal = saving_bal;
	}
	
	public double getMinBal() {
		return min_bal;
	}
	
	public double getSavBal() {
		return saving_bal;
	}
	
	public void display() {
		super.display();
		System.out.println("\nThe account balance is: "+this.getMinBal()+ " and Savings Balance of: "+this.getSavBal());
	}
}

/* Create another class named “Account_Details” which extends
 * the “Saving_Account” class and gathers all the properties of it. It also has two
 * properties(deposits & withdrawals) and a method named “display()” which prints all the
 * properties.
 */

class Account_Details extends Saving_Account{
	private double deposits;
	private double withdrawals;
	
	Account_Details(String customer_name, int account_no, double min_bal, double saving_bal, double deposits, double withdrawals){
		super(customer_name, account_no, min_bal, saving_bal);
		
		this.deposits = deposits;
		this.withdrawals = withdrawals;
	}
	
	public void setDeposits(double deposits) {
		this.deposits = deposits;
	}
	
	public void setWithdrawals(double withdrawals) {
		this.deposits = withdrawals;
	}
	
	public double getDeposits() {
		return deposits;
	}
	
	public double getWithdrawals() {
		return withdrawals;
	}
	
	public void display() {
		super.display();
		System.out.println("\nDeposited an Amount of: "+ this.getDeposits()+" Made a Withdrawal of: "+this.getWithdrawals());
	}
}

public class Q2 {

	public static void main(String[] args) {
		/* Now create an object of “Account_Details” in the main class and print all the
		 * properties of all the classes.
		*/
		Account_Details AccDet = new Account_Details("Simon", 42301315, 45.67, 234.56, 6987.05, 234.54);
		AccDet.display();
	}

}
