package inputtest;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 100) + 1;
		boolean hasWon = false;
		
		System.out.println(" Try to guess a random number between 1-100");
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 8; i > 0; i--) {
			System.out.println( i + " Guesses remain, try again:");
			int guess = scanner.nextInt();
			
			if (randomNumber < guess) {
				System.out.println("Less than " + guess);
			}
			if (randomNumber > guess) {
				System.out.println("Greater than " + guess);
			}
			if (randomNumber == guess) {
				hasWon = true;
				break;
			}
		}

		if (hasWon) {
		System.out.println("Correct");
		} 	else {
		System.out.println("Incorrect, the number was: " + randomNumber);
		}
	}
}