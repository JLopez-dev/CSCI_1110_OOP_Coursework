/* Name: John Lopez.	
 * Date: 7/15/2020.
 */

package Triangle;

public class TestProgram {
 
	public static void main(String[] args) {
		
		GeometricObject[] triangle = {new Triangle(3), 
									new Triangle(7), 
									new Triangle(9.5),
									new Triangle(15), 
									new Triangle(10)};

		
		for (int i = 0; i < triangle.length; i++) {
		 	System.out.println("\nTriangle: " + (i + 1));
		 	System.out.println("Area: " + triangle[i].getArea());
		 	System.out.println("How to color: " + ((Triangle)triangle[i]).howToColor());
		 } 
	}
}