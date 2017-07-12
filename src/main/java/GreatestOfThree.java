import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		// Ask the user for three integers, then print the greatest value
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me three numbers and I'll tell you which one is the greatest number.\nEnter the first number...");
		int number1 = input.nextInt();
		
		System.out.println("Give me your second number.");
		int number2 = input.nextInt();
		
		System.out.println("This is getting exciting! Okay, now give me your third number.");
		int number3 = input.nextInt();
		
//		int greatest;
//		if (number1 >= number2 && number1 >=  number3)
		
		if ((number1 > number2) && (number1 > number3)) {
			System.out.println(number1 + " is the greatest number of the three. Told you I could do it!");
		} else if ((number2 > number1) && (number2 > number3)) { 			
				System.out.println(number2 + " is the greatest number of the three. Told you I could do it!");
		} else {
			System.out.println(number3 + " is the greatest number of the three. Told you I could do it!");
			
		}
	}

}
