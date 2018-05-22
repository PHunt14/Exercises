/**
 * Write a program that calculates the energy needed to heat water from an initial temperature
 * to a final temperature.  Your Program should prompt the user to enter the amount of water in 
 * kilograms and the initial and final temperatures of the water.
 * 
 * Q = M * (finalTemperature - initialTemperature) * 4184
 *
 * Where M is the weight of the water in kilograms, temps are in celsius, and energy Q is joules
 */

package chapter2;

import java.util.Scanner;

public class exercise10 {
	
	// main method
	public static void main(String[] args) {
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain the starting temp
		System.out.println("Enter the initial temperature in celsius: ");
		double initialTemperature = input.nextDouble();

		// obtain the ending temp
		System.out.println("Enter the final temperature in celsius: ");
		double finalTemperature = input.nextDouble();

		// obtain the water weight
		System.out.println("Enter the amount of water in kilograms: ");
		double waterWeight = input.nextDouble();

		// calculate the energy in joules
		double energy = waterWeight * (finalTemperature - initialTemperature) * 4184;

		// display results
		System.out.println("The energy required to heat " + waterWeight + " kilograms of water from " 
			+ initialTemperature + " to " + finalTemperature + " is " + energy + " joules.");

	}

}
