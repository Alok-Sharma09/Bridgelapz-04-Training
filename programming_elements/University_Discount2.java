package programming_elements;

import java.util.Scanner;

public class University_Discount2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Fees : " );
		int fee = input.nextInt();
		
		System.out.println("Enter Discount percent : ");
		double discountpercent = input.nextDouble();
		double discount = (discountpercent/100) * fee;
		double final_fee = fee - discount;
		
		System.out.println("the Discount amount is INR " +discount + "and final discounted fee is " +final_fee);
		
		input.close();
		
	}

}
