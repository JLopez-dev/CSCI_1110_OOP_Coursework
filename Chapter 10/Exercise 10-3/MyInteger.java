/*
 * Author: John Lopez.
 * Date: 04/01/2020.
 * 
 * Description:
 * 
 * This code is used to find if a number is prime, odd, even, if a number is equal to a 
 * specified number value, convert an array numeric character to an integer value and convert a string 
 * into an integer value.
 */

package MyInteger;

public class MyInteger {

	private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
    	
       if(value == 1  || value == 2) {
    	   return true;
       }
     	   for (int i = 2; i < value; i++) {
    		   if (value % i == 0) 
    			   return false;
        	}
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
    	
     if(value == 1  || value == 2) {
    	 return true;
     }
    	for (int i = 2; i < value; i++) {
            if (value % i == 0) 
            	return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
    	return this.value == myInteger.value;
    }
    
    public static int parseInt(char[] c) {
    	int c1 = 0;
    	for(int i = 0; i < c.length; i++) {
    		c1 = c1 * 10 + (c[i] - '0');
    	}
    	return c1;
    }
    
    public static int parseInt(String s) {
    	int s1 = 0;
    	for(int i = 0; i < s.length(); i++) {
    		s1 = s1 * 10 + (s.charAt(i) - '0');
    	}
    	return s1;
    }
}