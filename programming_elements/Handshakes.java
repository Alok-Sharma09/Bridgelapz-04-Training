package programming_elements;

import java.util.Scanner;

public class Handshakes {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number of Students : ");
		int numberofStudents = input.nextInt();
		
		int possibleHandshakes = (numberofStudents * (numberofStudents - 1))/2;
		
		System.out.print("the number of possible of Handshakes is " +possibleHandshakes);
		
		input.close();
		
	}

}
