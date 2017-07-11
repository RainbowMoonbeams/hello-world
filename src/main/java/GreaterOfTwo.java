import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
		//Ask the user to input two integer values. Print the greater value.
		//Extension: ask the user for three integers, then print the greatest value.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Give me a number.");
		int number1 = input.nextInt();
		
		System.out.println("Give me another number.");
		int number2 = input.nextInt();
		
		int greaterNumber = (number1 > number2); {
		System.out.println(+ " is the greater number.");
		}
		if (number1 > number2); {
		System.out.println(number1 + " is the greater number.");
		} else {
		System.out.println(number2 + " is the greater number.");
}
	}
}
