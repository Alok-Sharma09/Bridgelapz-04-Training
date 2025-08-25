package programming_elements;

import java.util.Scanner ; 

public class DistanceinYardsandMiles {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance in Feet");
		double distanceinFeet = input.nextDouble();
		
		double distanceinYard = 3 * distanceinFeet ;
		double distanceinMiles = 1760 / distanceinFeet ;
		
		System.out.println("Distance in Yards is " +distanceinYard + " and distance in Miles is " +distanceinMiles);
		
		input.close();
		
	}

}
