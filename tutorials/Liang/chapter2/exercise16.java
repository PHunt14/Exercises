/** 
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.  
 *
 * A = (3sqrt(3)s^2)/2
 */

package chapter2;

import java.util.Scanner;

public class exercise16 {
	
	// main method
	public static void main(String[] args) {
		
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain the length of a side	
		System.out.print("Enter the side: ");
		double s = input.nextDouble();

		// calculate the area
		double area = (3 * Math.sqrt(3) / 2) * Math.pow(s, 2);
		
		// display results
		System.out.println("The area of the hexagon is " + area);

	}

}
