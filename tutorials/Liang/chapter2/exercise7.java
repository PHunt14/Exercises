/**
 * Write a program that prompts the user to enter the minutes, and displays the number of years and 
 * days for the minutes.
 */

package chapter2;

import java.util.Scanner;

public class exercise7 {
	
	// main method
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		// get the minutes
		System.out.print("Enter the number of minutes:: ");
		int minutes = input.nextInt();
		int years = minutes / 525600;
		int days = (minutes % 525600) / 60 / 24;
		// display the results
		System.out.println(minutes + " minutes is approximately " + years + " years and " + 
					days + " days.");
	}

}
