/* Name: John Lopez.
 * Date:  7/13/2020.
 */

package Exercise12_3;
import java.util.*;

public class Exercise12_3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int[] Array = new int [100];
			
	for(int i = 0; i < Array.length; i++) {	
		Array[i] = (int) (Math.random() * Array.length);
	}
	
	System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value: "+ 
				Array[input.nextInt()]);
		}
		catch (Exception ex) {
			System.out.println("Out of bounds");
		}
	return;
	}
}