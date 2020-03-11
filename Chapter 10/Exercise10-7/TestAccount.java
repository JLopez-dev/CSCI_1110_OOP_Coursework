/*
 * Author: John Lopez.
 * Date: 03/11/2020.
 */

package Account;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] atmMachine = {{"id1","1"}, 
								{"id2","2"}, 
								{"id3","3"}, 
								{"id4","4"}, 
								{"id5","5"}, 
								{"id6","6"}, 
								{"id7","7"}, 
								{"id8","8"}, 
								{"id9","9"}, 
								{"id0","0"}};
			
		
		
		String enterid = " ";
		
		System.out.println("Welcome to the ATM Machine.");
		
		while(enterid != "1" & enterid != "2" & enterid != "3" & enterid != "4" & 
				enterid != "5" & enterid != "6" &enterid != "7" & enterid != "8" &
				enterid != "9" & enterid != "0") {
			
		System.out.print("\nEnter an id: ");
		enterid = input.next();
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		
			if(enterid.equals("1")) {
				enterchoice();
			}
			else if(enterid.equals("2")) {
				enterchoice();
			}
			else if(enterid.equals("3")) {
				enterchoice();
			}
			else if(enterid.equals("4")) {
				enterchoice();
			}
			else if(enterid.equals("5")) {
				enterchoice();
			}
			else if(enterid.equals("6")) {
				enterchoice();
			}
			else if(enterid.equals("7")) {
				enterchoice();
			}
			else if(enterid.equals("8")) {
				enterchoice();
			}
			else if(enterid.equals("9")) {
				enterchoice();
			}
			else if(enterid.equals("0")) {
				enterchoice();
			}
			else {
			System.out.println("\nInvalid Id, please try it again.");
			}
			continue;	
		}
	}

	public static void enterchoice() {
		Scanner input = new Scanner(System.in);
				
		Account acc = new Account(1,2,3,4,5,6,7,8,9,0,100);
		String choice1 = " ";
		
		while(choice1 != "1" & choice1 != "2" & choice1 != "3" &
				choice1 != "4") {
		
		
		System.out.print("\nEnter a choice: ");
		choice1 = input.next();
			
			if(choice1.equals("1")) {
				System.out.printf("\nThe balance is: $%.2f\n", acc.getBalance());
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
			}
			
			else if(choice1.equals("2")) {
				System.out.print("\nEnter an amount to withdraw: ");
					int withdraw1 = input.nextInt();
					acc.withdraw(withdraw1);
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				}
			
			else if(choice1.equals("3")) {
				System.out.print("\nEnter an amount to deposit: ");
					int deposit1 = input.nextInt();
					acc.deposit(deposit1);
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
			}
		
			else if(choice1.equals("4")) {
				return;
				
			}
			
			else{
				System.out.println("\nInvalid choice, please try it again.");
				}
			continue;
			}
		}
	}
