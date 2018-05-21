/**
 * Write a program that reads in the radius and length of a cylinder and computes the area and 
 * volume using the following formulas:
 * 
 * area = radius + radius * pi
 * volume = area * length
 */

package chapter2;

import java.util.Scanner;

public class exercise2 {
	
	// main method
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		// read in radius and length (doubles)
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		// calculate area
		double area = radius * radius * Math.PI;
		// calculate volume
		double volume = area * length;
		// display are and volume
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}

}
