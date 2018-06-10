/** 
 * Write a program that prompts the user to enter a temperature between -58 fahrenheit and 41 fahrenheit
 * and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 *
 * windChill = 35.74 + 0.6215(temperature) - 35.75^(0.16) + 0.4275(temperature * windSpeed^(0.16))
 */

package chapter2;

import java.util.Scanner;

public class exercise17 {
	
	// main method
	public static void main(String[] args) {
		
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain the temperature
		System.out.print("Enter the temperature in Fahrenheit: ");
		double temperature = input.nextDouble();

		// obtain the windspeed
		System.out.print("Enter the wind spped in miles per hour: ");
		double windSpeed = input.nextDouble();

		// calculate the windchill
		double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow( windSpeed, 0.16)) + 0.4275 * (temperature * 
			(Math.pow(windSpeed, 0.16)));


		// display results
		System.out.println("The wind chill index is " + windChill);

	}

}
