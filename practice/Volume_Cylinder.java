package practice;

import java.util.Scanner;

public class Volume_Cylinder {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius of Cylinder : ");
		double radius =  input.nextDouble();
		
		System.out.print("Enter Height of Cylinder : ");
		double height = input.nextDouble();
		
		double Volume = Math.PI * radius * radius * height;
		
		System.out.print("Volume of Cyinder is : " + Volume);
		
		input.close();
	}

}
