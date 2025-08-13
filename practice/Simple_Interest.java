package practice;

import java.util.Scanner;

public class Simple_Interest {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Principal Amount : ");
		double Principal = input.nextDouble();
		
		System.out.print("Enter interest rate : ");
		double rate = input.nextDouble();
		
		System.out.print("Enter Time : ");
		double Time =  input.nextDouble();
		
		double Interest = (Principal * rate * Time)/ 100 ;
		
		System.out.print("Simple Interst is : " + Interest);
		
		input.close();
		
		
		
		
	}

}
