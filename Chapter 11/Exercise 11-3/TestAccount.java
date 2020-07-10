/*
 * Author: John Lopez.
 * Date: 07/09/2020.
 */

package Account;

public class TestAccount {
	public static void main(String[] args) {
		
		Account acc = new Account(1122, 300);
		CheckingsAccount checkingsAccount = new CheckingsAccount(1111,200);
		SavingsAccount savingsAccount = new SavingsAccount(1133, 150);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(100);
		checkingsAccount.withdraw(451);
		savingsAccount.withdraw(151);
		acc.deposit(100);
		
		System.out.printf("Balance: $%.2f%n", acc.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", acc.getMonthlyInterest());
		System.out.println("Date when this account was created: " + acc.getDateCreated());
		System.out.println(checkingsAccount);
		System.out.println(savingsAccount);
		
	}
}