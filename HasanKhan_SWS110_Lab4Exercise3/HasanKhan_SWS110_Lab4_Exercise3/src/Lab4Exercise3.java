import java.util.Scanner;
// Imports the scanner utility from the library
public class Lab4Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner input used to scan for user input
		
		String password = "abc123";
		String passwordEntered;
		// Password strings to hold value
		
		do {
			
			System.out.println("Please enter your password: ");
			 passwordEntered = input.next();
			 // Variable used to hold user input
	
			if (passwordEntered.equals(password)) {
				// If password entered equals to the correct password string, do this
				
			System.out.println("Access Granted!");
			
			}
		}while(!passwordEntered.equals(password));
		// While loop used to continuously repeat until the correct password is entered 
		input.close();
		}
	}
