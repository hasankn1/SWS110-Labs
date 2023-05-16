// Imports Scanner utility from java library
import java.util.Scanner;
public class Lab6Exercise1Enum {

	// Enumerated data types
	public static enum operatingSystems{Linux, MacOS, Windows, Android, iOS};
	
	
	public static void main(String[] args) {
		// Allows use of Scanner input
		Scanner input = new Scanner(System.in);
		
		// Create string variable to hold choice
		String choice;
		
		// Prompt user to select operating system
		System.out.println("Please select an Operating System.  \n1 - Linux \n2 - MacOS \n3 - Windows \n4 - Android \n5 - iOS");
		System.out.print("Enter the choice here (Type Exactly as Shown): ");
		
		// Store user input
		choice = input.next();
		
		// Checks if users input was entered correctly 
		try {
		
		// Checks users input
		switch (operatingSystems.valueOf(choice.trim())) {
		
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

		}
	}
		// If user's input was entered incorrectly, then the following message will be displayed
		catch (IllegalArgumentException e) {
				System.out.println("Error, you did not correctly select an Operating System. Please be sure to spell exactly as shown.");
		 }
	}
}