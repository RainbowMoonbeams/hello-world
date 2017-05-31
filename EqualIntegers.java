import java.util.Scanner;

public class EqualIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		// Ask the user for two integers.
		System.out.println("Give me one integer.");
		int integer1 = input.nextInt();
		
		System.out.println("Give me another integer.");
		int integer2 = input.nextInt();
		
//		If the integers are equal, tell them so.
		if (integer1 == integer2) {
			System.out.println(integer1 + " and " + integer2 + " are equal integers.");
		} else {
			System.out.println(integer1 + " and " + integer2 + " are not equal.");
		}
		
				
	}

}
