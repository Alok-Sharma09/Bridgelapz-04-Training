package programming_elements;

import java.util.Scanner;

public class IntOperation {
		public static void main(String[]args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter first number : ");
			int a = input.nextInt();
			
			System.out.print("Enter second number : ");
			int b = input.nextInt();
			
			System.out.print("Enter Third Number : ");
			int c = input.nextInt();
			
			int p = a+b*c;
			int q = a*b+c;
			int r = c + a / b;
			int s = a%b +c; 
			
			System.out.print("The results of operations are " +p + "," +q +"," +r +"," +s );
			input.close();
		}
		
}
