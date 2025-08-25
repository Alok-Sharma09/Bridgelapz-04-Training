package programming_elements;

import java.util.Scanner;

public class SideofSquare {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Perimeter of Square : ");
		double perimeter =  input.nextDouble();
		
		double side = perimeter/4 ;
		
		System.out.println("The length of the side is " +side + " whose perimeter is " +perimeter);
		
		input.close();
	}
	

	
	
	

}
