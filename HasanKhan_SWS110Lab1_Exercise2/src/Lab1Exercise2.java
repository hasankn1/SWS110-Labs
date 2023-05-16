import java.util.Scanner;
// Allows user to input data.
public class Lab1Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner input, "input" can also be replaced with "in"
		float Accountnumber;
		float Balance;
		float TotalitemsCharged;
		float Credits;
		float Newbalance;
		// Store data user enters as floats
		System.out.println("Welcome to Our Store!\n");
		System.out.println("Please enter your Account Number: ");
		Accountnumber = input.nextFloat();
		// Sets the next integer entered by the user as the value for "Accountnumber"
		System.out.printf("\nYour Account Number: " +Accountnumber);
		// Displays the account number
		System.out.println("\nPlease enter your balance at the beginning of the month: ");
		Balance = input.nextFloat();
		System.out.printf("\nYour balance at the beginning of the month is: " +Balance);
		// Displays the balance for the month
		System.out.println("\nTotal of all items charged this month: ");
		TotalitemsCharged = input.nextFloat();
		System.out.printf("\nYour total amount of items charged this month is: " +TotalitemsCharged);
		// Displays the total amount of charged items for the month
		System.out.println("\nTotal of all credits applied this month: ");
		Credits = input.nextFloat();
		System.out.printf("\nYour total credits applied this month is: " +Credits);
		// Displays the total credits applied this month
		Newbalance = Balance - TotalitemsCharged + Credits;
		// Calculates the new balance using this formula
		System.out.printf("\nYour new balance is: %f",  +Newbalance);
		// Displays the new balance
		input.close();
		/* This code allows the scanner to stop scanning for new inputs for the user.
		 * Can also be written as "in.close();"
		 * Fix for: Resource leak: 'input' is never closed
		*/
		System.out.println("\nThank you for shopping with us!");
		// End message
	}

}
