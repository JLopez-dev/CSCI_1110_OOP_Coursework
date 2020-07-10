/* Author: John Lopez.
 * Date: 06/30/2020.
 */

package Triangle;

public class Triangle {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private java.util.Date dateCreated;
	
	Triangle(){
		dateCreated = new java.util.Date();
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public double getArea() {
		return getArea();
	}

	public double getPerimeter() {
		return getPerimeter();
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2  = " + side2 + " side3  = " + side3;
	}
}	