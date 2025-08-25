package programming_elements;

import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		double a = input.nextDouble();
		
		System.out.print("Enter second number : ");
		double b = input.nextDouble();
		
		System.out.print("Enter Third Number : ");
		double c = input.nextDouble();
		
		double p = a+b*c;
		double q = a*b+c;
		double r = c + a / b;
		double s = a%b +c; 
		
		System.out.print("The results of operations are " +p + "," +q +"," +r +"," +s );
		input.close();
	}
	
}

