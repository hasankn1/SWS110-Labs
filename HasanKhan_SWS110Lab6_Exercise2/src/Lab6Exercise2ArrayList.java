// Imports Scanner utility from java library
import java.util.Scanner;
// Program makes use of ArrayList
import java.util.ArrayList;

public class Lab6Exercise2ArrayList {

	static // Allows use of Scanner input in the program.
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Creates an ArrayList called  "countSalary"
		ArrayList<Integer> countSalary = new ArrayList<Integer>();

		// Creates a string array called "salaries"
		ArrayList<String> salaries = new ArrayList<String>();

		// Add the following elements to the ArrayList "salaries"
		salaries.add("1. $200 - $299"); 
		salaries.add("2. $300 - $399");
		salaries.add("3. $400 - $499");
		salaries.add("4. $500 - $599");
		salaries.add("5. $600 - $699");
		salaries.add("6. $700 - $799");
		salaries.add("7. $800 - $899");
		salaries.add("8. $900 - $999");
		salaries.add("9. $1000 and over");

		// Trims the capacity of the ArrayList to the amount of elements
		salaries.trimToSize();

		// Add the following elements as 0 to the ArrayList "countSalary"
		countSalary.add(0);
		countSalary.add(0);
		countSalary.add(0);
		countSalary.add(0);
		countSalary.add(0);
		countSalary.add(0);
		countSalary.add(0);
		countSalary.add(0);
		countSalary.add(0);

		// Double variable to hold sales
		double sales;

		// Int variable to hold salary
		int salary;

		// String value to hold choice
		String choice;



		//loop allowing user to enter employee salaries, until user decides to exit
		do {
			//prompts the user to enter the employee's gross weekly sales
			System.out.print("Please enter employee's gross weekly sales: $");
			sales = input.nextDouble();
			
			// Formula used to calculate employee's salary
			salary = (int) (200 + (0.09*sales));

			System.out.println("$"+salary);

			// Checks the salary range and increments by 1 if within the given salary range

			// If salary is between $200 and $299, then increment countSalary(0) by one
			if (salary>=200 && salary<=299) 
			{
				countSalary.set(0, 	countSalary.get(0) + 1);
			}

			// If salary is between $300 and $399, then increment countSalary(1) by one
			else if (salary>=300 && salary<=399) 
			{
				countSalary.set(1, 	countSalary.get(1) + 1);	
			}

			// If salary is between $400 and $499, then increment countSalary(2) by one
			else if (salary>=400 && salary<=499) 
			{
				countSalary.set(2, 	countSalary.get(2) + 1);
			}

			// If salary is between $500 and $599, then increment countSalary(3) by one
			else if (salary>=500 && salary<=599) 
			{
				countSalary.set(3, 	countSalary.get(3) + 1);	
			}

			// If salary is between $600 and $699, then increment countSalary(4) by one
			else if (salary>=600 && salary<=699) 
			{
				countSalary.set(4, 	countSalary.get(4) + 1);	
			}

			// If salary is between $700 and $799, then increment countSalary(5) by one
			else if (salary>=700 && salary<=799) 
			{
				countSalary.set(5, 	countSalary.get(5) + 1);	
			}

			// If salary is between $800 and $899, then increment countSalary(6) by one
			else if (salary>=800 && salary<=899) 
			{
				countSalary.set(6, 	countSalary.get(6) + 1);	
			}

			// If salary is between $900 and $999, then increment countSalary(7) by one
			else if (salary>=900 && salary<=999) 
			{
				countSalary.set(7, 	countSalary.get(7) + 1);	
			}

			// If salary is over $1000, then increment countSalary(v8) by one
			else if (salary>1000) 
			{

				countSalary.set(8, 	countSalary.get(8) + 1);	
			}

			// Prompts the user if they would like to enter another employee's salary
			System.out.print("Would you like another entry (y = Yes/any key = No)?: ");

			// Stores the user's input in the variable choice
			choice = input.next();

			// Capitalizes user's choice and stores it in variable "choice"
			choice = choice.toUpperCase();

			// Loop continues while user chooses y and exits when user chooses otherwise
		}  while (choice.equals("Y"));

		// Outputs the salary ranges and the amount of people that earned them
		System.out.println("    Salaries   | Amount");

		for (int x=0; x<9; x++) {

			System.out.println(salaries.get(x) + " | " + countSalary.get(x));	
		}	
	}
}