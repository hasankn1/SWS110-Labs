import java.util.Scanner;
// New Scanner utility
public class Lab3Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Allows users to enter data into the program.
		
		System.out.println("Welcome to the File Compression Calculator!\n\n");
		System.out.printf("%s", "Enter the file size in megabytes: ");
		// Friendly introduction to the program.
		
		double fileSize = input.nextLong();
		//next input by the user will be stored in this variable
		
		System.out.println("You entered: " +fileSize);
		System.out.printf("\nEnter the compression software: %n1 - 7-Zip%n2 - WinZip%n3 - WinRar%n4 - PeaZip%n");
		// Confirming user input, and asking user for next input
		
		int programChoice = input.nextInt();
		   // Program choice is stored in this variable
		
		if (programChoice <=0) {
		
			System.out.println("You entered an invalid number!\nPlease pick a number between 1-4.");
		
		}
		
		else {
		
			if (programChoice >=5) {
				System.out.println("You entered an invalid number!\nPlease pick a number between 1-4.");
			}
		
			switch (programChoice)
			// Switch statements that checks the user input and makes a decision based on their input
		      {                                                
		      	case 1:
		      		// If program choice is 1:
		      		fileSize = fileSize * 0.39;
					System.out.println("You entered 7-Zip.");
					System.out.printf("The file size when compressed will be: "+ fileSize + " megabytes.");
					break;
					// Exits the switch for this case 
		        
		      	case 2:
		      	// If program choice is 1:
		      		fileSize = fileSize * 0.41;
					System.out.println("You entered WinZip.");
					System.out.printf("The file size when compressed will be: "+ fileSize + " megabytes.");      
		            break;
		          // Exits the switch for this case
		                                                          
		        case 3:
		        	// If program choice is 1:
		        	fileSize = fileSize * 0.44;
					System.out.println("You entered WinRar.");
					System.out.printf("The file size when compressed will be: "+ fileSize + " megabytes.");       
		        	break;
		        	// Exits the switch for this case
		                                                          
		        case 4:
		        	// If program choice is 1:
		        	fileSize = fileSize * 0.445;
					System.out.println("You entered PeaZip.");
					System.out.printf("The file size when compressed will be: "+ fileSize + " megabytes.");      
		            break;
		          // Exits the switch for this case                
		      }
	      }
		input.close();
		
		

	}
}

