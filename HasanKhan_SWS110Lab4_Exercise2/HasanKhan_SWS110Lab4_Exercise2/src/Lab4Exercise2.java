import java.util.Scanner;
// Scanner input used to take input from the user
public class Lab4Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your shape choice:\n1 - Square\n2 - Triangle");
		int choice = input.nextInt();
		// Choice user enters is stored in this variable
		
		if (choice > 2) {
			System.out.println("You have entered an invalid number!");
			choice = 999;
				}
		// When the user inputs an invalid number or any number over 2
		
		else {
		if (choice < 1) {
			System.out.println("You have entered an invalid number!");
			choice = 999;
		}
		// When the user inputs an invalid number or any number less than 1
		
		while (choice <= 2) {
			
			if (choice == 1) {
				System.out.println("You chose Square\n");
				
				for (int square = 1; square <= 9; square++) {
					System.out.println("*********");
					choice++;
					// If choice is 1 do this
				}
			}
				
				else {
					if (choice == 2) {
				
					System.out.println("You chose Triangle\n");
					
					for (int rows = 9; rows >= 1; rows--)
					{	
					
					for (int triangle = 1; triangle <= rows; triangle++) 
						{
		                System.out.print("*");
						}
						System.out.println(" ");
		            choice++;
		            // If choice is 2 do this
					
					}
					}
				}
					input.close();
				}
		}
}
}
