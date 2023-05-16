import java.util.Scanner;
// imports scanner utility from java library
public class Lab5Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Allows the use of scanner

		System.out.println("Please enter the width of the rectangle: ");
		int width = input.nextInt();
		// holds the value of width the user enters

		System.out.println("Please enter the height of the rectangle: ");
		int height = input.nextInt();
		// holds the value of height the user enters

		System.out.printf("Area of rectangle is %d%n", area(height, width));
		System.out.printf("Square of rectangle is %f%n", perimeter(height, width));
		
		if(isSquare(height, width)){
			// Checks to see whether or not the rectangle is a square
			System.out.print("Number is square");
		}
		else{
			System.out.print("Number is not square");
		}
	}	

	// square method with int argument
	public static int area(int height, int width)
	{
		int areaOfRectangle;
		areaOfRectangle = width * height;
		// formula used to calculate area of rectangle
		return areaOfRectangle;
		// returns the value of area
	}

	public static double perimeter(int height, int width)
	{
		int perimeterOfRectangle;
		perimeterOfRectangle = 2 * (height + width);
		// Formula to calculate perimeter of rectangle
		return perimeterOfRectangle;
		// returns value of perimeter
	}

	static boolean isSquare(int height, int width) {
		{
			if (height == width)
				// Calculates if rectangle is a square or not
			{
				return true;
			}
		}

		return false;
	}


}


