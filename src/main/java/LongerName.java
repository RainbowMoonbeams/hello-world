import java.util.Scanner;

public class LongerName {

	public static void main(String[] args) {
		// Ask the user for her first name and last name. Use the length() method to tell her which is longer.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hey what's your first name?");
		String firstName = input.nextLine();
				
		System.out.println("And what's your last name?");
		String lastName = input.nextLine();
		
		int palindromeLength1 = firstName.length();
		int palindromeLength2 = lastName.length();
		System.out.println(firstName + " has " + palindromeLength1 + " letters and " + lastName + " has " + palindromeLength2 + " letters.");
		
		System.out.println();
		
		if (palindromeLength1 > palindromeLength2) {
			System.out.println("Your first name, " + "\"" + firstName + "\"" + " has more letters.");
		} else if (palindromeLength1 < palindromeLength2) {
			System.out.println("Your last name, \"" + lastName + "\" has more letters.");
		} else {
			System.out.println("Your first name, \"" + firstName + "\" and last name, \"" + lastName + "\" have the same amount of letters.");
		}
		
		
		
//		String palindrome = "A dog, a panic, in a pagoda";
//		int palindromeLength = palindrome.length();
//		System.out.println(palindrome + " has " + palindromeLength
//			+ " characters.");
		
	}

}
