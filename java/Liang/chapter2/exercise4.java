/**
 * Write a program that converts pounds into kilograms.  The program prompts the user to enter a 
 * number in pounds, converts it to kilograms, and displays the result.  One pound is 0.454 kilograms.
 */

package chapter2;

import java.util.Scanner;

public class Exercise4 {
	
	// main method
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		// get pounds input
		System.out.print("Enter a number in pounds: ");
		// convert to kilograms
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		// display kilograms
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	}

}
