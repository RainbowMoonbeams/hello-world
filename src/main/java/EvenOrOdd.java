import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	
		// ask the user for a number
//			tell the user if the number is even or odd
				
			System.out.println("Type a number. Any number.");
			int inputNumber = input.nextInt();
			
			if (inputNumber % 2 == 0) {
				System.out.println(inputNumber + " is an even integer.");
			} else {
				System.out.println(inputNumber + " is not an even integer.");
			}
//			if number (inputNumber + " is an even number.");
//		} else {
//			System.out.println(inputNumber + " is an odd number.")
			
	}

}
