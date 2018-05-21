/**
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 */

package chapter2;

import java.util.Scanner;

public class exercise6 {
	
	// main method
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		// get the integer
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		// split up the number, sum the digits
		int firstDigit = number % 10;
		number = number / 10;
		int secondDigit = number % 10;
		number = number / 10;
		int total = firstDigit + secondDigit + number;
		// display result
		System.out.println("The sum of the digits is " + total);
	}

}
