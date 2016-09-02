/**
 * Write a program that reads a Celsius degree in a double value from the console, then converts it 
 * to Fahrenheit and displays the result.  The formula for the conversion is as follows:
 * 
 * fahrenheit = (9 / 5) * celsius + 32
 */

package chapter2;

import java.util.Scanner;

public class Exercise1 {
	
	// main method
	public static void main (String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		// get user input in celsius
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		// calculate fahrenheit from celsius
		double fahrenheit = (9.0 / 5) * celsius + 32; 
		// display fahrenheit
		System.out.println(celsius + " Celsius is " + fahrenheit + " fahrenheit");
	}

}
