/** 
 * Write a program that displays a random uppercase letter using the System.CurrentTimeMillis() method.
 */

package chapter2;

import java.util.Scanner;

public class exercise22 {
	
	// main method
	public static void main(String[] args) {

		// get the current time
		long time = System.currentTimeMillis();
	
		// get random uppercase letter
		long value = 'A' + time % ('Z' - 'A' + 1);

		// display results
		System.out.println( (char) value );
		

	}

}
