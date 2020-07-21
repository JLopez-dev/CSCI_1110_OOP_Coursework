/* Name: John Lopez.
 * Date: 7/15/2020.
 */

package Triangle;

class GeometricObject extends Triangle {
	private String color = " ";
	private boolean filled;

	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
}