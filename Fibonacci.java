/*
 * File: Fibonacci.java
 * This program will display the terms in the Fibonacci sequence up to the MAX_TERM_VALUE.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram{

	//Defining the constant MAX_TERM_VALUE
	private static final int MAX_TERM_VALUE = 10000;
	
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int term = 0, sum1 = 0, sum2 = 1;
		//Fibonacci sequence length as determined by the MAX_TERM_VALUE constant above
		while(term < MAX_TERM_VALUE){
			//Prints out the current number of the sequence
			println(term + "\n");
			//term then becomes the sum of previous 2 numbers in the sequence and sum1 becomes smaller number in next calculation and sum2 because bigger number in next calculation.
			term = sum1 + sum2;
			sum1 = sum2;
			sum2 = term;
		}
	}
}
