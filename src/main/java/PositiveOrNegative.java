import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		// Ask for a number
//		Tell whether the number is positive or negative.
//		What if the user puts "0"?? Then what will it say?
		
		System.out.println("Give me a number. Any number. Positive or negative... or a zero...");
		int number = input.nextInt();
		
		if (number <=-1) {
			System.out.println(number + " is a negative number.");
		} else if (number >=1) {
			System.out.println(number + " is a positive number.");
		} else {
			System.out.println(number + " is a zero!");
		}

}
}
