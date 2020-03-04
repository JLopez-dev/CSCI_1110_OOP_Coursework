/*
 * Author: John Lopez.
 * Date: 3/3/2020.
 */

package Rectangle;

public class Rectangle {
	
	double width = 1;
	double height = 1;
	
	Rectangle(){
		
	}
	
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
}