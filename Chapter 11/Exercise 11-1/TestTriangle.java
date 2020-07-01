/*
 * Author: John Lopez.
 * Date: 06/30/2020.
 */

package Triangle;

import java.util.Scanner;
public class TestTriangle {
	//s = ((side1 + side2 + side3) / 2);
	//Area = Math.sqrt(s(s - side1)(s - side2)(s - side3));
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle triangle = new Triangle ();
		
		System.out.print("Enter the side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Enter the side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Enter the side 3: ");
		double side3 = input.nextDouble();
		System.out.print("Enter the color: ");
		String color = input.next();
		System.out.print("Enter if is filled 'true' or 'false': ");
		String filled = input.next();
		
		double s = ((side1 + side2 + side3) / 2);
		System.out.println("\nTriangle side 1: " + side1 + "\nTriangle side 2: " +
				side2 + "\nTriangle side 3: " + side3);
		System.out.println("Area: " + Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
		System.out.println("Perimeter: " + ((side1 + side2 + side3) / 2));
		System.out.println("Color: " + color);
		System.out.println("Is Filled?: " + filled);
		System.out.println("Date Created: " + triangle.getDateCreated());
		}
	}