import java.util.Scanner;

public class StreetAddress {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter street address:");

		int houseNumber = input.nextInt();
		String street = input.next();
		String address = input.next();
		
		System.out.println("house number is " + houseNumber);
		System.out.print("street is " + street);
		System.out.println();
	}

}
