import java.util.Scanner;

public class DontBeMean {

	public static void main(String[] args) {
		// Ask the user for four integers. 
		// Calculate the mean (average) of these and display the result.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a number.");
		int firstNumber = input.nextInt();
		
		System.out.println("Give me a second number.");
		int secondNumber = input.nextInt();
		
		System.out.println("Give me a third number.");
		int thirdNumber = input.nextInt();
		
		System.out.println("Give me a fourth number.");
		int fourthNumber = input.nextInt();
		
		int meanNumber = ((firstNumber + secondNumber + thirdNumber + fourthNumber) / 4);
		
		System.out.println(meanNumber + " is the mean.");
		
	}

}
