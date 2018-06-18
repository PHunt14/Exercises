/** Write a program that displays the following table
 *
 * 	a		b		pow(a, b)
 * 	1		2		1
 * 	2		3		8
 * 	3		4		81
 * 	4		5		1024
 * 	5		6		15625
 */

package chapter2;

import java.util.Scanner;

public class exercise18 {
	
	// main method
	public static void main(String[] args) {
		
		// display results
		System.out.println("a		b		pow(a,b)");
		float a = 1;
		float b = 2;

		// show table
		System.out.println(a + "		" + b + "		" + Math.pow(a, b));
		// increment a
		a++;
		// increment b
		b++;
		System.out.println(a + "		" + b + "		" + Math.pow(a, b));
		a++;
		b++;
		System.out.println(a + "		" + b + "		" + Math.pow(a, b));
		a++;
		b++;
		System.out.println(a + "		" + b + "		" + Math.pow(a, b));
		a++;
		b++;
		System.out.println(a + "		" + b + "		" + Math.pow(a, b));
		a++;
		b++;
		

	}

}
