import java.util.Scanner;

public class AEIOU {

	public static void main(String[] args) {
		// Ask the user for a character, and tell the user whether it is a vowel or a consonant.

		Scanner input = new Scanner(System.in);

		System.out.println("What is your favorite letter?");
		String letter = input.next();

		switch (letter) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "y":
			System.out.println(letter + " is a great letter! And it's a vowel. Yay!");
			break;
		default:
			System.out.println(letter + " is a great letter! But it's not a vowel.");

		}

	}
}
