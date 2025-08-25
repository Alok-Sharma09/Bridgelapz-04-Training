package programming_elements;

public class Pen {
	public static void main(String[]args) {
		int pens = 14;
		int students =  3;
		int penperstudent = pens/students;
		int remainingpen = pens % students;
	
		System.out.println("The Pen per Student is " +penperstudent + " and the remaining pen not distributed is " +remainingpen);
	}

}
