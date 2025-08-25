package programming_elements;

import java.util.Scanner;

public class Area_Triangle {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Base : ");
		double baseInches = input.nextDouble();
		
		System.out.println("Enter Height");
		double heightInches = input.nextDouble();
		
		double AreaInches = 1/2 * baseInches * heightInches ;
		
		double  conversionfactor = 2.54 * 2.54 ;
		double AreaCms = AreaInches * conversionfactor;
		
		System.out.println("Area of Triangle in square Inches is " +AreaInches + " and in square centimetres is  " +AreaCms); 
		
	}

}
