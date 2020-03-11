/*
 * Author: John Lopez.
 * Date: 03/03/2020.
 */

package Rectangle;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 40);
		System.out.println("Rectangle 1");
		System.out.println("The width is: " + r1.width);
		System.out.println("The height is: " + r1.height);
		System.out.printf("The area is: %.2f%n", r1.getArea());
		System.out.printf("The perimeter is: %.2f%n", r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.println("\nRectangle 2");
		System.out.println("The width is: " + r2.width);
		System.out.println("The height is: " + r2.height);
		System.out.printf("The area is: %.2f%n", r2.getArea());
		System.out.printf("The perimeter is: %.2f%n", r2.getPerimeter());
		
	}
}
