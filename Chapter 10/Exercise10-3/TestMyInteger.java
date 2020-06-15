package MyInteger;

public class TestMyInteger {

	public static void main(String[] args) {

        MyInteger num1 = new MyInteger(2);
        MyInteger num2 = new MyInteger(3);
        MyInteger num3 = new MyInteger(4);
         
        

        System.out.println("getValue(): " + num1.getValue());
        System.out.println("getValue(): " + num2.getValue());
        System.out.println("getValue(): " + num3.getValue());
        
        System.out.println("\n" + num1.getValue() + " isEven(): " + num1.isEven());
        System.out.println(num2.getValue() + " isEven(): " + num2.isEven());
        System.out.println(num3.getValue() + " isEven(): " + num3.isEven());
        
        System.out.println("\n" + num1.getValue() + " isOdd(): " + num1.isOdd());
        System.out.println(num2.getValue() + " isOdd(): " + num2.isOdd());
        System.out.println(num3.getValue() + " isOdd(): " + num3.isOdd());
        
        System.out.println("\n" + num1.getValue() + " isPrime(): " + num1.isPrime());
        System.out.println(num2.getValue() + " isPrime(): " + num2.isPrime());
        System.out.println(num3.getValue() + " isPrime(): " + num3.isPrime());
        
        System.out.println("\n" + num1.getValue() + " isEven() static: " + MyInteger.isEven(num1));
        System.out.println(num1.getValue() + " isOdd() static: " + MyInteger.isOdd(num1));
        System.out.println(num1.getValue() + " isPrime() static: " + MyInteger.isPrime(num1));
        
        System.out.println("\n" + num2.getValue() + " isEven() static: " + MyInteger.isEven(num2));
        System.out.println(num2.getValue() + " isOdd() static: " + MyInteger.isOdd(num2));
        System.out.println(num2.getValue() + " isPrime() static: " + MyInteger.isPrime(num2));
        
        System.out.println("\n" + num3.getValue() + " isEven() static: " + MyInteger.isEven(num3));
        System.out.println(num3.getValue() + " isOdd() static: " + MyInteger.isOdd(num3));
        System.out.println(num3.getValue() + " isPrime() static: " + MyInteger.isPrime(num3));
        
        System.out.println("\n" + num1.getValue() + " equals 2: " + num1.equals(2));
        System.out.println(num2.getValue() + " equals 6: " + num2.equals(6));
        System.out.println(num3.getValue() + " equals 4: " + num3.equals(4));
        
        System.out.println("\nparseInt(char[] c) static: " + MyInteger.parseInt(new char[] {'2','3'}));
        System.out.println("parseInt(String s) static: " + MyInteger.parseInt(new String ("23")));
        		
    }
}