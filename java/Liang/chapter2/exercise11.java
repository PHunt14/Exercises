/**
 * Write a program to display the population for each of the next five years.  Assume the current population
 * is 312032486 and one year has 365 days.  Hint: In Java, if two integers perform division the result is 
 * an integer.  The fraction part is truncated.
 *
 * Assumptions: 1 birth every 7 seconds, 1 death every 13 seconds, 1 new immigrant every 45 seconds
 */

package chapter2;

import java.util.Scanner;

public class exercise11 {
	
	// main method
	public static void main(String[] args) {
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// current population
		int currentPopulation = 312032486;

		// births per year
		int yearlyBirths = 4505142;

		// deaths per year
		int yearlyDeaths = 2425846;

		// immigration per year
		int yearlyImmigration = 700800;

		// first year
		int firstYear = currentPopulation + yearlyBirths + yearlyImmigration - yearlyDeaths; 

		// second year
		int secondYear = firstYear + yearlyBirths + yearlyImmigration - yearlyDeaths;

		// third year
		int thirdYear = secondYear + yearlyBirths + yearlyImmigration - yearlyDeaths;

		// fourth year
		int fourthYear = thirdYear + yearlyBirths + yearlyImmigration - yearlyDeaths;

		// fifth year
		int fifthYear = fourthYear + yearlyBirths + yearlyImmigration - yearlyDeaths;

		// display results
		System.out.println("The population will be " + firstYear + " after 1 year, " + secondYear +
			" after 2 years, " + thirdYear + " after 3 years, " + fourthYear +
			" after 4 years, " + fifthYear + " after 5 years." );

	}

}
