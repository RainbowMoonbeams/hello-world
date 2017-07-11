import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hey, what's your name?");
		String name = input.nextLine();
		
		String asLower = name.toLowerCase();
		System.out.println("Hello, " + name.toLowerCase() + ".");
		input.close();
	}
	
}
