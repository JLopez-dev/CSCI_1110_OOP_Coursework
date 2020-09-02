/* Author: John Lopez.
 * Date: 8/28/2020.
 */

package exercise17_07;

import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) 
            throws IOException, ClassNotFoundException {
        
        try ( // Create an input stream for file Exercise17.07.dat
            ObjectInputStream input = new ObjectInputStream(new 
                BufferedInputStream(new FileInputStream("Exercise17_07.dat")))
        ) { // Read Loan objects from file and display the total loan amount
            while (true) {
                Loan loan = (Loan)input.readObject();
                System.out.printf("Total loan amount: $%.2f\n", 
                    loan.getTotalPayment());
                System.out.println();
            }
        }
        catch (EOFException ex) {
            
            // Use EOFExecption to end the loop
        }
    }
}