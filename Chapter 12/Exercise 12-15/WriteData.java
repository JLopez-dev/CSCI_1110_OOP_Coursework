/* Name: John Lopez.
 * Date: 7/14/2020.
 * 
 */

package Exercise12_15;
import java.io.*;

public class WriteData {
	public static void main(String[] args) throws IOException{
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if(file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		try (
			java.io.PrintWriter output = new java.io.PrintWriter(file);
		){
		
		for(int i = 0; i < 100; i++) {
			output.print((int)(Math.random() * 100));
			output.print(" ");
			}	
		}
	}
}