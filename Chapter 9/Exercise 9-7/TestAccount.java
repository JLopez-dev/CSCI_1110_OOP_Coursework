/*
 * Author: John Lopez.
 * Date: 03/04/2020.
 */

package Account;

public class TestAccount {
	public static void main(String[] args) {
		
		Account acc = new Account(1122, 20000);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.printf("Balance: $%.2f%n", acc.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", acc.getMonthlyInterest());
		System.out.println("Date when this account was created: " + acc.getDateCreated());
		
	}
}
