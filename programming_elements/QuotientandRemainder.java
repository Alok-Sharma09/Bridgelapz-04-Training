package programming_elements;

import java.util.Scanner;

public class QuotientandRemainder {
	public static void main (String[]args ) {
		
			Scanner input = new Scanner(System.in);
			
		System.out.print("Enter first number: ");
		double number1 = input.nextDouble();
		
		System.out.print("Enter second Number: ");
		double number2 = input.nextDouble();
		
		double quotient = number1/number2 ;
		double remainder = number1 % number2 ;
		
		System.out.print("The Quotient is " +quotient + " and remaninder is " +remainder);
		 input.close();
		
		
		
	}

}
