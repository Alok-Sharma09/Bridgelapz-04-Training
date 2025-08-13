package practice;

import java.util.Scanner;

public class Area_Circle {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius of CIrcle : ");
		double radius = input.nextDouble();
		
		double area = Math.PI * radius * radius;
		
		System.out.print("The Area of Circle is " + area);
		
		input.close();
		
		
		
	 
	}
} 
