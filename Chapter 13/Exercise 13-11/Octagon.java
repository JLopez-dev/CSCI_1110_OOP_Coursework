/* Name: John Lopez.
 * Date: 7/15/2020.
 */

package Exercise13_11;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	
	private double side;

	public Octagon() {
		this.side = 1;
	}

	
	public Octagon(double side) {
		this.side = side;
	}

	
	public void setSide(double side) {
		this.side = side;
	}

	
	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	@Override
	public int compareTo(Octagon octg) {
		if (getArea() > octg.getArea())
			return 1;
		else if (getArea() < octg.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}
}
