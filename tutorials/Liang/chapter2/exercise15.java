/** Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their 
 * distance between them.  The formula for computing the distance between two points is:
 *
 * squareRoot((x2-x1)^2 + (y2-y1)^2)
 *
 */

package chapter2;

import java.util.Scanner;

public class exercise15 {
	
	// main method
	public static void main(String[] args) {
		
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain x1 and y1
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		// obtain x2 and y2
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// calculate distance
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		// display results
		System.out.println("The distance between the two points is: " + distance);

	}

}
