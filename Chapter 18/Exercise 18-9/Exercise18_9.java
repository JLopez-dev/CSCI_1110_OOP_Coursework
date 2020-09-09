/* Name: John Lopez.
 * Date: 9/3/2020.
 */

package Exercise18_9;
import java.util.Scanner;

public class Exercise18_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.print("Enter a Word: ");
        String value = input.nextLine();
        
        reverseDisplay(value);
        
    }
    
    private static void reverseDisplay(String value){
        
        if (value.length() == 1) {
            System.out.println(value);
        }
        else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}