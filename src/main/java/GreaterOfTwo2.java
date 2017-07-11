import java.util.Scanner;

public class GreaterOfTwo2 {

	public static void main(String[] args) {
		// Ask the user to input two integer values. Print the greater value.
		//Extension: ask the user for three integers, then print the greatest value

		Scanner input = new Scanner(System.in);
		
		System.out.println("Throw a number at me.");
		int number1 = input.nextInt();
		
		System.out.println("Throw another number at me.");
		int number2 = input.nextInt();
		
		
		if (number1 > number2) {
			System.out.println(number1 + " is the greater number.");
		} else {
			System.out.println(number2 + " is the greater number.");
	}

}
}
