/* Author: John Lopez.
 * Date: 8/25/2020.
 */

package exercise17_03;

import java.io.*;

public class Exercise17_03 {
	public static void main(String[] args) throws IOException {
            int sum = 0;
        // Get the file for this exercise
        File file = new File("Exercise17_03.dat");

        // if file doesn't exist create the file and write a random number of integers
        if (!file.exists() || true) {
            try (DataOutputStream out =
                         new DataOutputStream(new FileOutputStream(file))) {

                int num = (int) (Math.random() * 100);

                for (int i = 0; i < num; i++) {
                    out.writeInt((int)(Math.random() * 100));
                }
            }
        }
        // Read the file and display the sum
        try (DataInputStream input = new DataInputStream(new FileInputStream(file));
                
            ){
            
            while (true) {
                sum += input.readInt();
                
            }   
        }
            catch (EOFException ex) {
            System.out.println("The sum is " + sum);
        }
    }
}
