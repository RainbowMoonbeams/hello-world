
public class SmallestOfSum {

	public static void main(String[] args) {
		// The sum of three consecutive numbers is 72. 
		int oneThird = 72 / 3;
		
//		What are the smallest of these numbers?
		int smallest = oneThird - 1;
		int middle = oneThird;
		int largest = oneThird + 1;
		
		System.out.println (smallest);
		
		System.out.println("All the numbers are " + smallest + ", " + middle + ", and " + largest + ".");

	}

}
