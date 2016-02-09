package aulasUdemy;

/**
 * @author Erico
 * 
 *         Arrays
 *
 */

public class Aula14 {

	private static int[] values;

	public static void main(String[] args) {
		values = new int[3];

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		for (int i = 0; i < values.length; i++) {
			System.out.println("O valor na posição " + i + " do array é: "
					+ values[i]);
		}

	}

}
