package practice;

import java.util.Scanner;

public class Temperature_Converter {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celcius : ");
		double c = input.nextDouble();
		
		double f = (c * 9/5) + 32;
		
		System.out.print("Temperature in Fahrenheit is : " + f);
		
		input.close();
				
	}

}
