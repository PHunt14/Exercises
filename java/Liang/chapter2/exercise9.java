/**
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second
 * the ending velocity v1 in meters/second and the time span t in seconds, and displays
 * the average acceleration.
 *
 * Average acceleration: a = (v1-v0)/t
 */

package chapter2;

import java.util.Scanner;

public class exercise9 {
	
	// main method
	public static void main(String[] args) {
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain the starting velocity v0
		System.out.println("Enter the starting velocity: ");
		double v0 = input.nextDouble();

		// obtain the ending velocity v1
		System.out.println("Enter the ending velocity: ");
		double v1 = input.nextDouble();

		// obtain the timespan t
		System.out.println("Enter the timespan: ");
		double t = input.nextDouble();

		// calculate the average acceleration
		double acceleration = (v1 - v0) / t;

		// display results
		System.out.println("The average acceleration is " + acceleration);

	}

}
