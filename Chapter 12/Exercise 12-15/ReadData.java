/* Name: John Lopez.
 * Date: 7/14/2020
 * 
 */

package Exercise12_15;
import java.util.*;

public class ReadData {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("Exercise12_15.txt");
		Scanner input = new Scanner(file);
				
		ArrayList<Integer> nums = new ArrayList<>();
		
		while (input.hasNext()) {
			nums.add(input.nextInt());
			}
		Collections.sort(nums);
		
		System.out.print(nums);
		System.out.print(" ");
		input.close();
	}
}