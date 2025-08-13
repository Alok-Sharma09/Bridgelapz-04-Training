package practice;

import java.util.Scanner;

public class Perimeter_Rectangle {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter LEngth of Rectangle : ");
		double Length = input.nextDouble();
		
		System.out.print("Enter widht of Rectangle : ");
		double Width = input.nextDouble();
		
		double Perimeter = 2 * (Length + Width);
		
		System.out.print("The PErimeter of REctangle is : " + Perimeter);
		
		input.close();
		
		
		
	}

}
