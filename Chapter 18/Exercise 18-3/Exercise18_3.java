/* Name: John Lopez.    
 * Date: 9/2/2020.
 */

package Exercise18_3;
import java.util.Scanner;

public class Exercise18_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two integers: ");
            int m = Integer.parseInt(input.next());
            int n = Integer.parseInt(input.next());
            
	System.out.println("The Greatest Common Divisor of " + m + " and " + n 
		+ " is " + gcd(m, n) + ".");
}
    private static int gcd(int m, int n) {
        if (m % n == 0)
            return n; 
        else 
            return gcd(n, m % n);
    }
}