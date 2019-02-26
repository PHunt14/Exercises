/**
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in
 * meters/second squared (m/s^2), and displays the minimum runway length.
 *
 * length = v^2/2a
 */

package chapter2;

import java.util.Scanner;

public class exercise12 {
	
	// main method
	public static void main(String[] args) {
		// start scanner
		Scanner input = new Scanner(System.in);

		// obtain the velocity in m/s
		System.out.print("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();

		// calculate the runway length required
		double length = (v * v)/(2 * a);

		// display results
		System.out.println("The minimum runway length for this airpllane is " + length);

	}

}
