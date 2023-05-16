import java.util.Scanner;
// Imports Scanner utility
public class Lab6Exercise1 {

	// Enumerated values
	private static final int Linux = 1;

	private static final int MacOS = 2;

	private static final int Windows = 3;

	private static final int Android = 4;

	private static final int iOS = 5;


	public static void main(String[] args) {

		// Creates int variable
		int choice; 

		// Allows use of scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Please select an Operating System.  \n1 - Linux \n2 - MacOS \n3 - Windows \n4 - Android \n5 - iOS");

		System.out.print("Enter the choice here: ");
		choice = input.nextInt(); //stores the user's input in the variable choice

		// Checks user's input
		switch (choice) {

		// If user chose "Linux", then the following message will be displayed
		case Linux:
			System.out.println("You chose Linux");	
			break;	

			// If user chose "MacOS", then the following message will be displayed
		case MacOS:
			System.out.println("You chose MacOS");	
			break;

			// If user chose "Windows", then the following message will be displayed
		case Windows:
			System.out.println("You chose Windows");	
			break;

			// If user chose "Android", then the following message will be displayed
		case Android:
			System.out.println("You chose Android");	
			break;

			// If user chose "iOS", then the following message will be displayed
		case iOS:
			System.out.println("You chose iOS");	
			break;

			// If user's input was entered incorrectly, then the following message will be displayed
		default:
			System.out.println("Error, you did not correctly select an Operating System corresponding to its number.");

		}
	}
}
