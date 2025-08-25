package programming_elements;

import java.util.Scanner;

public class Shopping {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter price of Item : ");
	double unitPrice = input.nextDouble();
	
	System.out.print("Enter Quantity : ");
	int quantity = input.nextInt();
	
	double total = unitPrice * quantity ;
	
	System.out.println("The total purchase price is INR " +total + " if the quantity is " +quantity + " and unnit price is INR " +unitPrice);
	
	input.close();
		
	}
	

}
