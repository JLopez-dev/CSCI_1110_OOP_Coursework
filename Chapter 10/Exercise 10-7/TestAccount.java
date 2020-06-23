/*
 * Author: John Lopez.
 * Date: 06/23/2020.
 */

package Account;
import java.util.Scanner;

public class TestAccount{

	public static void main(String[] args) {
		Account[] acc = new Account [10]; 

		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account(i,100);
		}
		atm(acc);
	}

	public static void atm(Account[] acc) {

		Scanner input = new Scanner(System.in);
		int enterid = 0;

		System.out.print("\nEnter an id (0 - 9): ");
		enterid = input.nextInt();
		while(enterid != 0 && enterid != 1 && enterid != 2 && enterid != 3 && enterid != 4 && 
				enterid != 5 && enterid != 6 && enterid != 7 && enterid != 8 && 
				enterid != 9) {

			System.out.println("\nError!, Invalid ID..");
			System.out.print("\nEnter an id (0 - 9): ");
			enterid = input.nextInt();

		}
		int enterchoice = 0;
		while (enterchoice != 4) {

			System.out.println("\nMain menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.print("\nEnter choice: ");
			enterchoice = input.nextInt();

			switch(enterchoice) {
			case 1: 
				System.out.printf("\nYour balance is: $%.2f%n" , acc[enterid].getBalance());
				break;
			case 2: 
				System.out.print("\nEnter an amount to withdraw: ");
				acc[enterid].withdraw(input.nextDouble());
				break;
			case 3: 
				System.out.print("\nEnter an amount to deposit: ");
				acc[enterid].deposit(input.nextDouble());
				break;
			case 4: 
				System.out.println("\nExiting to the main menu.");
				atm(acc);
			default: 
				System.out.println("\nError!, Try again..");
				continue;
			}
		}
	}
}