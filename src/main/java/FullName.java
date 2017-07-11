import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		// Ask the user for her first name and last name,
//		then print her full name, including the necessary space between first and last name.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Let's play a game.");
		System.out.println();
		System.out.println("Tell me your name and I'll tell you your name.");
		System.out.println();
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("And what's your last name?");
		String lastName = input.nextLine();	
		
		System.out.println("Your full name is " + firstName + " " + lastName + ". I'm so smart.");
	}

}
