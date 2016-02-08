package automobile;

/***
 * Difference in data type of arguments
 * 
 * @author Erico
 *
 */

public class CarsOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increaseSeatHeight(3);
		increaseSeatHeight("8");

	}

	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increased seat height by " + heightToIncrease
				+ " inches. I am the integer one.");
	}

	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("Increased seat height by " + heightToIncrease
				+ " inches. I am the String one.");
	}

}
