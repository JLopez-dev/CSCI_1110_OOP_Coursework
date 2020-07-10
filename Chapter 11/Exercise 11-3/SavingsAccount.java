/*
 * Author: John Lopez.
 * Date: 07/09/2020.
 */

package Account;

class SavingsAccount extends Account{
	private double overdrawnlimit = 0;
		
	public SavingsAccount(int id, double balance) {
		super(id, balance);
		if(balance < overdrawnlimit) {
			System.out.println("Error!");
		}
	}
	
	@Override
	double withdraw(double amount) {
		if(getBalance() - amount <= overdrawnlimit) {
			super.withdraw(amount);
		}
		return getBalance();
	}
	
	@Override
	public String toString() {
		
		if(getBalance() < overdrawnlimit ) {
			return "Savings Account balance = " + overdrawnlimit + " (You have reached your overdrawn limit.)";
		}
		else{
		}
		return "Savings Account balance = " + getBalance();
	}
}