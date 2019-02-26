/**
 * Write a program that reads a number in feet, converts it to meters, and displays the result.  
 * One foot it 0.305 meter.
 */

package chapter2;

import java.util.Scanner;

public class exercise3 {
	
	// main class
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		// read in feet
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		// convert to meters
		double meters = feet * 0.305;
		// display meters
		System.out.println(feet + " feet is " + meters + " meters.");
	}

}
