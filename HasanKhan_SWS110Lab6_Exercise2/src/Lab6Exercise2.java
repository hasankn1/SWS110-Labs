// Imports the Scanner utility from the java library
import java.util.Scanner;
public class Lab6Exercise2 {

	public static void main(String[] args) {
		// Allows use of scanner input in the program.
		Scanner input = new Scanner(System.in);
		
		// Create new array which contains 9 elements (0-8) 
		int countSalary[] = new int[9]; //creates array called  "countSalary" containing 9 elements
		
		// Creates a string array with the following values:
		String salaries[] = {"1. $200 - $299", "2. $300 - $399", "3. $400 - $499", "4. $500 - $599", "5. $600 - $699", "6. $700 - $799", "7. $800 - $899", "8. $900 - $999", "9. $1000 and over"}; 
		
		// Double value used to hold sales
		double sales;
		
		// Int value to store salary
		int salary;
		
		// String value used to hold choice
		String choice;
		
		//loop allowing user to enter employee salaries, until user decides to exit
		do {
			
		//prompts the user to enter the employee's gross weekly sales
		System.out.print("Please enter employee's gross weekly sales: $");
		
		// Stores user input
		sales = input.nextDouble();
		
		// Formula used to calculate employee salary
		salary = (int) (200 + (0.09*sales));
		
		System.out.println("$"+salary);
		
		//checks the salary range and increments by 1 if within the given salary range
		
		//if salary is between $200 and $299, then increment countSalary[0] by one
		if (salary>=200 && salary<=299) {
			countSalary[0] = countSalary[0] + 1;	
		}
		//if salary is between $300 and $399, then increment countSalary[1] by one
		else if (salary>=300 && salary<=399) {
			countSalary[1] = countSalary[1] + 1;	
		}
		//if salary is between $400 and $499, then increment countSalary[2] by one
		else if (salary>=400 && salary<=499) {
			countSalary[2] = countSalary[2] + 1;	
		}
		//if salary is between $500 and $599, then increment countSalary[3] by one
		else if (salary>=500 && salary<=599) {
			countSalary[3] = countSalary[3] + 1;	
		}
		//if salary is between $600 and $699, then increment countSalary[4] by one
		else if (salary>=600 && salary<=699) {
			countSalary[4] = countSalary[4] + 1;	
		}
		//if salary is between $700 and $799, then increment countSalary[5] by one
		else if (salary>=700 && salary<=799) {
			countSalary[5] = countSalary[5] + 1;	
		}
		//if salary is between $800 and $899, then increment countSalary[6] by one
		else if (salary>=800 && salary<=899) {
			countSalary[6] = countSalary[6] + 1;	
		}
		//if salary is between $900 and $999, then increment countSalary[7] by one
		else if (salary>=900 && salary<=999) {
			countSalary[7] = countSalary[7] + 1;	
		}
		//if salary is over $1000, then increment countSalary[8] by one
		else if (salary>1000) {
			countSalary[8] = countSalary[8] + 1;	
		}
		
		//prompts the user if they would like to enter another employee's salary
		System.out.print("Would you like another entry (y = Yes/any key = No)?: ");
		
		choice = input.next(); //stores the user's input in the variable "choice"
		choice = choice.toUpperCase(); //makes the user's choice capital and stores it in variable "choice"

		
		}  while (choice.equals("Y")); //loop continues while user chooses y and exits when user chooses otherwise
		
		// Outputs the salary ranges and the amount of people that earned them
		System.out.println("    Salaries   | Amount");
		for (int x=0; x<9; x++) {
			
			System.out.println(salaries[x] + " | " + countSalary[x]);
		}
	}
}
