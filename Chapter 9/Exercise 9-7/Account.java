/*
 * Author: John Lopez.
 * Date: 03/04/2020.
 */

package Account;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	double monthlyInterestRate = annualInterestRate / 12;
	Account(){
		
	}
	 
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return balance / 100;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	double getMonthlyInterestRate() {
		return monthlyInterestRate;
		
	}
	
	double getMonthlyInterest() {
		return balance * (annualInterestRate / 12) / 100;
	}
	
	double withdraw(double amount) {
		return balance = balance - amount;
	}
	
	double deposit(double amount) {
		return balance = balance + amount;
		
	}
}
