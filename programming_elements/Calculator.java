package programming_elements;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number : ");
		double number1 = input.nextDouble();
		
		System.out.println("Enter second number : ");
		double number2 = input.nextDouble();
		
		double addition = number1 + number2 ;
		double subtraction = number1 - number2;
		double multiplication = number1 * number2;
		double division = number1/number2;
		
		System.out.printf("The addition , subtraction , multipication and division value of two numbers " +number1 +" and " +number2 +" is " +addition +" , " +subtraction + " , " +multiplication +"," +division);
		
		input.close();
		
		
	}

}
