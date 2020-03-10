/*
 * Author: John Lopez.
 * Date: 
 */

package MyInteger;

public class MyInteger {
	
	
	int value;
	
	MyInteger(){
		
	}
	
	MyInteger(int newValue){
		value = newValue;
	}

	double getValue() {
		return value;
	}

	boolean isEven() {
		if(value % 2 == 0) {
		}
		return true;
	}
	
	boolean isOdd() {
		if(value % 2 != 0) {
			
		}
		return true;
	}
	
	public static boolean isEven(int isEven) {
		if(isEven % 2 == 0) {
		}
		return true;
	}
}