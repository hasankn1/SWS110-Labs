import java.security.SecureRandom;
// Imports SecureRandom form java utility library
import java.util.Scanner;
// Imports Scanner utility

public class Lab5Exercise1 {

	private static final SecureRandom randomNumbers = new SecureRandom();

	static Scanner input = new Scanner(System.in);

	public static final int randomNumber() {

		int rngNumber = (1 + randomNumbers.nextInt(1000));
		// Generates a random number between 1-1000

		return rngNumber;
		// Returns the number
	}

	public static int randomNumberGuesser() {

		int counter = 0;
		// Initializes the counter variable as 0

		int rngNumber = randomNumber();
		// rngNumber is equal to the value retrieved from 'randomNumber' method

		int userGuess;
		// Variable to hold user's guess

		do {
			System.out.println("I have a number between 1 and 1000.");

			System.out.println(rngNumber);

			System.out.println("Please enter your guess:");
			userGuess = input.nextInt();
			// Puts user's guess into userGuess variable

			if (userGuess == rngNumber){
				System.out.println("Excellent! You guessed: "+counter+ " times!\nWould you like to play again (1-Yes, 2-No)");

				if (counter < 10) {
					// if counter is lesser than 10 do this
					System.out.println("I think you know the secret!");
				}

				else
					if(counter > 10) {
						// if counter is greater than 10 do this
						System.out.println("You can do better!");
					}

				int playAgainCheck = input.nextInt();
				// Variable to hold weather or not the user wants to play again or not

				return playAgainCheck;
				// returns the number
			}

			else  
				if (userGuess > rngNumber){
					// if userGuess is greater than rngNumber do this
					System.out.println("Too high! Try again!");
				}

				else  
					if (userGuess < rngNumber){
						// if userGuess is less than rngNumber do this
						System.out.println("Too low! Try again!");
					}

			counter = counter + 1;
			// Increases the counter by one each time the user takes a guess

		}while (userGuess != rngNumber);
		// Loop that runs infinitely if 'userGuess' variable does  not equal to 'rngNumber' variable

		return 0;
		// return nothing
	}

	public static void main(String[] args) {

		int playAgain = randomNumberGuesser();
		// playAgain variable holds the value of randomNumberGuesser method

		if (playAgain == 1) {
			// if user would like to play again, run randomNumberGuesser again
			randomNumberGuesser();
		}

		else 
			if (playAgain == 2){
				// If the users asks to not play again, the program terminates
				System.out.println("You chose to quit the game.");
			}
	}
}