/** 
 * Write a program that reads in investment amount, annual interest rate, and number of years, and displays the future
 * investment value.
 */

package chapter2;

import java.util.Scanner;

public class exercise21 {
	
	// main method
	public static void main(String[] args) {

		// start scanner
		Scanner input = new Scanner(System.in);

		// obtain the investment amount, annual interest rate, and number of years
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();

		// calculate future investment value
		double monthlyInterestRate = annualInterestRate / 1200;
		double futureInvestmentValue = investmentAmount * Math.pow(( 1 + monthlyInterestRate ), (numberOfYears * 12));
		
		// display results
		System.out.println("Accumulated value is " + futureInvestmentValue );
		

	}

}
