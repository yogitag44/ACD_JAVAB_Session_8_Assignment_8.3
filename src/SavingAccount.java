import java.util.Scanner;    //Scanner class to take input from the user
  
public class SavingAccount   //Main accounting class to perform banking activities
{
	private double balance;   //private variable balance
	private double interest;    //private variable interest

	public SavingAccount()    //Initial Account
	{
		//Initialised variables
		balance = 0;   
		interest = 0;
	}

	public SavingAccount(double initialBalance, double initialInterest)   //two parameter constructor of the class
	{
		
		balance = initialBalance;   //Passing value of balance as initial balance
		interest = initialInterest;  //Passing value of interest as initial interest
		
		//Printing current balance and interest
		System.out.println("Initial Balance in Account is: "+balance);
		System.out.println("Interest on the balance is: "+interest);
	}

	public void deposit(double amount)    //To calculate the deposit amount
	{
		balance = balance + amount; //Amount after deposit
		
		//Printing current bank statement
		System.out.println("\nAmount deposited in the Account: "+amount);
		System.out.println("Amount after deposite: "+balance);
	}

	public void withdraw(double amount)    //To calculate amount after withdrawl of amounts
	{
		balance = balance - amount;   //amount deducted from the main balance
		System.out.println("\nAmount withdrwal from the Account: "+amount);
		System.out.println("Amount left after withdrawl: "+balance);
	}

	public void addInterest()   //To calculate the interest on the balance in account
	{
		balance = balance + balance * interest;   //to calculalte the balance
	}

	public double getBalance()
	{
		return balance;    //returning the balance
	}
	
	public static void main(String[] args)    //Main method to call all the methods
	{
		SavingAccount MyAccount = new SavingAccount(1000, 0.10);   //passing value to the method
		MyAccount.deposit(400);   //calling deposit function
		MyAccount.withdraw(250);   //calling withdraw function
		MyAccount.addInterest();   //calling interest function
		System.out.println("\nCurrent Balance is: "+MyAccount.getBalance());   //printing current balance
		System.out.println("Expected: 1265.0");
		//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
	}

}

