
public class LittleBoxes {

	public static void main(String[] args) {
		//Maria has some boxes. She bought seven more. 
		int boxesPurchased = 7;
		
//		A week later half of all her boxes were destroyed in a fire.
//		There are now only 22 boxes left. 
		int boxesAfterFire = 22;
		
//		With how many did she she start with?
		int boxesBeforeFire = 2 * boxesAfterFire;
		
		int boxesBeforeBuying = boxesBeforeFire - boxesPurchased;
		
		System.out.println("She had " + boxesBeforeBuying + " boxes before buying more boxes.");

	}

}
