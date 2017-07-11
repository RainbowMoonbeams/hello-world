import java.util.Scanner;

public class Riddle2 {

	public static void main(String[] args) {
		// Q: What has 4 eyes but can’t see? A: Mississippi
		Scanner input = new Scanner(System.in);
		
		System.out.println("Can you answer this riddle?");
		System.out.println();
		System.out.println("What has 4 eyes but can't see?");
		String answer = input.nextLine();
		
		if (answer == "Mississippi") {
			System.out.println("You are correct!");
		} else {
			System.out.println("That answer is not acceptable :(");
		}
	}

}
