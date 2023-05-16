import java.util.Scanner;
// Allows user to input data
public class Lab2Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double bytes;
		// Variable bytes to allow conversion
		
		System.out.println("Please enter the file size: ");
		
		double fileSize = input.nextDouble();
		// Variable to hold file size
		
		System.out.printf("File size is: " +fileSize+ "");
		
		System.out.printf("%nPlease enter your file type:%n1-Kilobytes%n2-Megabytes%n3-Gigabytes%n4-Terabytes%n");
		// Allows user to enter what file type they want to convert
		
		int fileType = input.nextInt();
		
		if (fileType == 1) {
			// If number entered is 1 then do these steps next
			System.out.printf("You entered: " + fileType + " for kilobytes");
			bytes = fileSize * Math.pow(2, 10);
			System.out.printf("%nThe file is: " +bytes+ " bytes");
			
		}
		
			else {
				
				if (fileType == 2) {
					// If number entered is 2 then do these steps next
					System.out.printf("You entered: "+ fileType + " for megabytes");
					bytes = fileSize * Math.pow(2, 20);
					System.out.printf("%nThe file is: " +bytes+ " bytes");
				
				}
				
					else {
						
						if (fileType == 3) {
							// If number entered is 3 then do these steps next
							System.out.printf("You entered: " + fileType + " for gigabytes");
							bytes = fileSize * Math.pow(2, 30);
							System.out.printf("%nThe file is: " +bytes+ " bytes");
							
						}
						
							else {
								
								if (fileType == 4) {
									// If number entered is 4 then do these steps next
									System.out.printf("You entered: " + fileType + " for terabytes");
									bytes = fileSize * Math.pow(2, 40);
									System.out.printf("%nThe file is: " +bytes+ " bytes");
									
								}
									
										}
									}
			input.close();
			// Closes Scanner input
								}
				}
		
					

			}
		
	

