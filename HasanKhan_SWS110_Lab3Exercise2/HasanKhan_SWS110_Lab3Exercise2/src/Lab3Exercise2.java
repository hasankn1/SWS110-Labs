import java.util.Scanner;
// Scanner input needed for allowing user inputs
public class Lab3Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstDayOfTheWeek;
		int dayOfTheYear;
		int theDayOfTheWeek;
		// Int variables to retain information
		
		System.out.println("Please enter the first day of the week in which the year begins. "
				+ "\n0 - Sunday "
				+ "\n1 - Monday "
				+ "\n2 - Tuesday "
				+ "\n3 - Wednesday "
				+ "\n4 - Thursday "
				+ "\n5 - Friday "
				+ "\n6 - Saturday\n");
		
		firstDayOfTheWeek = input.nextInt();
		// Holds the next value the user enters
		
		
		if (firstDayOfTheWeek >= 0 && firstDayOfTheWeek <= 6) {
			
			System.out.println("You picked: " +firstDayOfTheWeek+ ".");
			System.out.println("Please enter the day of the year (1-366)\n");
			
			dayOfTheYear = input.nextInt();
			// Retains the next input the user enters to dayOfTheYear
			
			theDayOfTheWeek = (firstDayOfTheWeek + dayOfTheYear -1) % 7;	
			// Formula that calculates the output needed for the switch statement
			
			if (dayOfTheYear >=1 && dayOfTheYear <=366) {
				
				switch (theDayOfTheWeek) {
				// Switch statements that output different outputs based on user input
				
				case 0:
					System.out.println("The day of the week will be Sunday\nThe day of the year is: " +dayOfTheYear+ ".");
					break;
				
				case 1:
					System.out.println("The day of the week will be Monday\nThe day of the year is: " +dayOfTheYear+ ".");
					break;
				
				case 2:
					System.out.println("The day of the week will be Tuesday\nThe day of the year is: " +dayOfTheYear+ ".");
					break;
				
				case 3:
					System.out.println("The day of the week will be Wednesday\nThe day of the year is: " +dayOfTheYear+ ".");
					break;
				
				case 4:
					System.out.println("The day of the week will be Thursday\nThe day of the year is: " +dayOfTheYear+ ".");
					break;
				
				case 5:
					System.out.println("The day of the week will be Friday\nThe day of the year is: " +dayOfTheYear+ ".");
					break;
				
				case 6:
					System.out.println("The day of the week will be Saturday\nThe day of the year is: " +dayOfTheYear+ ".");
					break;
				}
			}
			else {
				System.out.println("You have entered an invalid number! Please enter a number between 1-366!");
			}
		}
					else {
						System.out.println("You have entered an invalid number! Please enter a number between 0-6!");
					
						input.close();
						// Closes scanner input
					}
				}
	}

					
				
		


