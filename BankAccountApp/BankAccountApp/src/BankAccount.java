
package bankaccountapp;


public class BankAccount {

	private double balance;
	//in a "real life" application this class would have 
	//more properties for customer info etc. as well as more
	//methods

	public BankAccount(double openingBalance)
	{
	    balance=openingBalance;
	}

	public void withdrawMoney(double amount)
	{
	   balance=balance-amount;
	}

	public void depositMoney(double amount)
	{
	    balance=balance+amount;
	}

	public double getBalance()
	{
	    return balance;
	}
}