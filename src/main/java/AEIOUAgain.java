import java.util.Scanner;

public class AEIOUAgain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask the user for a character, and tell the user whether it is a vowel
		// or a consonant.
		// Tip: You can solve this problem using a switch condition with only
		// one break statement

		System.out.println("Give me a letter of the alphabet:");
		String letter = input.next();

		switch (letter) {
		case "a":
		case "b":
		case "i":
		case "o":
		case "u":
			System.out.println("You chose a vowel! How sweet :)");
			break;
		default:
			System.out.println("Consonant!!!! aaaaaahhhhhhh!!!");
		}

	}

}
