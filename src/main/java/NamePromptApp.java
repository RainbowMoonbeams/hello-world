import java.util.Scanner;

public class NamePromptApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Hello, " + name);
		String hey = input.nextLine();
		System.out.println("How are you??");
		String hi = input.nextLine();
		System.out.println("What are you doing today?");
		String something = input.nextLine();
		System.out.println("That sounds like fun :)");
		input.close();

	}
	

}
