/*
 * Author: John Lopez.
 * Date: 07/09/2020.
 */

package Account;

class CheckingsAccount extends Account{
	private double overdraftlimit = -250;
	
	
	public CheckingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	@Override
	double withdraw(double amount) {
		if(getBalance() - amount <= overdraftlimit) {
			 super.withdraw(amount);
		}
		return getBalance();
	}
	
	@Override
    public String toString() {
		
		if(getBalance() < overdraftlimit ) {
			return "Checkings Account balance = " + overdraftlimit + " (You have reached your overdraft limit.)";
		}
		else{
		}
		return "Checking Account balance = " + getBalance();
	}
}