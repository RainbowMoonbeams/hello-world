import java.util.Scanner;

public class Riddle {

	public static void main(String[] args) {
		// Q: What has 4 eyes but can’t see? A: Mississippi
		Scanner input = new Scanner(System.in);
		
		System.out.println("Answer this riddle:");
		System.out.println("What has 4 eyes but can't see?");
		String response = input.nextLine();
		
		if ("mississippi".equalsIgnoreCase(response)) {
		System.out.println("You got it, dude!");
		} else {
			System.out.println("WRONG!");
		}

}
}
