package programming_elements;

public class Volume_Earth {
	public static void main(String[]args) {
		double radiusKM = 6378;
		double radiusM = 0.621 * radiusKM;
		double volume = Math.PI * (4.0/3.0) * Math.pow(radiusKM,3);
		double volume_miles = Math.PI * (4.0/3.0) * Math.pow(radiusM, 3);
		
		System.out.println("The volume of Earth in Cubic kilometres is " +volume  + " and cubic miles is " +volume_miles );
	}

}
