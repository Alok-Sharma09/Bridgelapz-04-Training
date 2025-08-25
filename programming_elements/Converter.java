package programming_elements;

import java.util.Scanner;
public class Converter {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Distance in km : ");
		int km = input.nextInt();
		double miles = 0.621 * km;
		
		System.out.print("Total miles is  " +miles  + " for given " +km + " km .");
		
		input.close();
	}

}
