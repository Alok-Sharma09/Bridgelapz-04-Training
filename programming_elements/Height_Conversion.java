package programming_elements;

import java.util.Scanner;

public class Height_Conversion {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter hieght in cm: ");
		double heightcm = input.nextDouble();
		double inches = heightcm/2.54 ;
		int feet =(int) inches/ 12 ;
		double inch = inches%12;
		
		System.out.println("Your height in cm is " +heightcm  + " while in feet is " +feet + "and inches is " +inch ) ;
		
		input.close(); 
		
		
	}
	

}
