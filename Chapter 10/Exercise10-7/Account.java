/*
 * Author: John Lopez.
 * Date: 03/11/2020.
 */

package Account;

public class Account {
	
	private int id1 = 0;
	private int id2 = 0;
	private int id3 = 0;
	private int id4 = 0;
	private int id5 = 0;
	private int id6 = 0;
	private int id7 = 0;
	private int id8 = 0;
	private int id9 = 0;
	private int id0 = 0;
	private double balance = 0;
	Account(){
		
	}
	 
	Account(int newId1,int newId2,int newId3,int newId4,int newId5,
			int newId6,int newId7,int newId8,int newId9,int newId0,
			double newBalance){
		id1 = newId1;
		id2 = newId2;
		id3 = newId3;
		id4 = newId4;
		id5 = newId5;
		id6 = newId6;
		id7 = newId7;
		id8 = newId8;
		id9 = newId9;
		id0 = newId0;
		balance = newBalance;
	}

	public int getId1() {
		return id1;
	}
	
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public int getId2() {
		return id2;
	}
	
	public void setId2(int id2) {
		this.id2 = id2;
	}
	public int getId3() {
		return id3;
	}
	
	public void setId3(int id3) {
		this.id3 = id3;
	}
	public int getId4() {
		return id4;
	}
	
	public void setId4(int id4) {
		this.id4 = id4;
	}
	public int getId5() {
		return id5;
	}
	
	public void setId5(int id5) {
		this.id5 = id5;
	}
	public int getId6() {
		return id6;
	}
	
	public void setId6(int id6) {
		this.id6 = id6;
	}
	public int getId7() {
		return id7;
	}
	
	public void setId7(int id7) {
		this.id7 = id7;
	}
	public int getId8() {
		return id8;
	}
	
	public void setId8(int id8) {
		this.id8 = id8;
	}
	public int getId9() {
		return id9;
	}
	
	public void setId9(int id9) {
		this.id9 = id9;
	}
	public int getId0() {
		return id0;
	}
	
	public void setId0(int id0) {
		this.id0 = id0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	double withdraw(double amount) {
		return balance = balance - amount;
	}
	
	double deposit(double amount) {
		return balance = balance + amount;
		
	}
}
