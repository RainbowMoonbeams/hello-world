import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		// Ask the user to input two integer values. Print the greater value.
		// Extension: ask the user for three integers, then print the greatest value.

		Scanner input = new Scanner(System.in);

		System.out.println("Give me a number.");
		int firstNumber = input.nextInt();

		System.out.println("Give me another number.");
		int secondNumber = input.nextInt();

		boolean greaterNumber = (firstNumber > secondNumber);

		if (firstNumber > secondNumber)	{
			System.out.println(firstNumber + " is the greater number.");
		} else {
			System.out.println(secondNumber + " is the greater number.");
		}
	}
}
