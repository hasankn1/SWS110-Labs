import java.util.Scanner;
// Allows the use of Scanner in program
public class Lab2Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double perimeter;
		double area;
		// Variables for both perimeter and area
		
		System.out.printf("Please enter the Radius: ");
		double radius = input.nextDouble();
		// The value the user enters is stored in the variable of radius
		
		if (radius <= 0) {
			// If the user enters a value of 0 or below the program notifies them of the error, if not the program will calculate the value
			
			System.out.println("Radius cannot be less than 0!");
			// Tells the user they have entered an invalid number.
		}
			else {
				
		perimeter = 2 * Math.PI * radius;
		// Perimeter formula of a circle
		
		area = Math.PI * Math.pow(radius, 2);
		// Area formula of a circle
		
		System.out.printf("%nPerimeter of the circle is: %f", +perimeter);
		//Displays the perimeter of the circle based on what the user has entered for the value of radius
		
		System.out.printf("%nArea of the cirlce is: %f", +area);
		//Displays the area of the circle based on what the user has entered for the value of radius
		
		input.close();
		// Closes the scanner input
		
	}
		
  }
}
