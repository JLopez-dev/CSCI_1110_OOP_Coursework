/* Name: John Lopez.
 * Date: 7/15/2020.
 */

package Triangle;

public class Triangle extends GeometricObject implements Colorable{

	private double side;
	
	
	public Triangle() {
	}
	
	public Triangle(double side) {
		this.side = side;
	}
	
	public Triangle(String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}
	
	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	
	@Override
	public double getArea() {
		return getArea();
	}
	
	@Override
	public double getPerimeter() {
		return getPerimeter();
	}
	
	@Override
	public String howToColor() {
		return "Color all four sides";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}
}	