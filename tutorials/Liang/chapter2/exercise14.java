/**
 * Write a program that prompts the user to enter a weigh in pounds and height in inches and siaplys the BMI.
 * Note: 1 pound is 0.45359237 kilograms and 1 inch is 0.0254 meters.
 *
 * BMI = weight / height^2 ( in kg and m)
 */

package chapter2;

import java.util.Scanner;

public class exercise14 {
	
	// main method
	public static void main(String[] args) {
		
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weightPounds = input.nextDouble();
		
		// obtain height in inches
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();

		// calculate BMI
		double BMI = (weightPounds * 0.45359237) / ( (heightInches * 0.0254) * (heightInches * 0.0254) );
		
		// display results
		System.out.println("BMI is " + BMI);

	}

}
