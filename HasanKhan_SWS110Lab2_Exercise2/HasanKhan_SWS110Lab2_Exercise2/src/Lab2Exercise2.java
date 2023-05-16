import java.util.Scanner;
// Allows users to enter inputs
public class Lab2Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double transferTime;
		// Variable for transfer time
		
		System.out.println("Please enter the file size in megabytes: ");
		// Asks for user inputs
		
		double fileSize = input.nextDouble();
		// Inputs file size user enters into variable "fileSize"
		
		if (fileSize <= 0) 
		{
			System.out.println("File size cannot be less than 0!");
		// Checks if user has input an invalid number
			
		}
		
		else {
		
		System.out.printf("You entered: " +fileSize+ " megabytes");
		// Shows user inputs for file size, for user convenience
		
		fileSize = fileSize * 8 * Math.pow(10, 6);
		// Formula converts file size from user into bits.
		
		System.out.println("\nPlease enter transfer speed in megabits: ");
		// Asks for user input
		
		double transferSpeed = input.nextDouble();
		// Inputs transfer speed user enters into variable "transferSpeed"
		
		if (transferSpeed <= 0) 
		{
			System.out.println("Transfer speed cannot be less than 0!");
		// Checks if user has input an invalid number
			
		}
		
		else {
		
		System.out.printf("You entered: " +transferSpeed + " megabits");
		// Shows user their input for transfer speed, for user convenience
		
		transferSpeed = transferSpeed  * Math.pow(10, 6);
		// Formula converts transfer speed from user to bits.
		
		transferTime = fileSize / transferSpeed;
		// Formula for transfer time using inputs from the user.
		
		System.out.printf("%nThe file transfer time is: " +transferTime+ " seconds.");
		// Displays the transfer time
		
		input.close();
		// Closes scanner input

			}
		}
	}
}
