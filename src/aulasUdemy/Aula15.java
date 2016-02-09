package aulasUdemy;

/**
 * @author Erico
 * 
 *         Arrays of String
 *
 */

public class Aula15 {
	private static String[] texts;

	public static void main(String[] args) {
		texts = new String[3];

		texts[0] = "Primeiro texto do array!";
		texts[1] = "Segundo texto do array!";
		texts[2] = "Terceiro texto do array!";

		for (int i = 0; i < texts.length; i++) {
			System.out.println("O array de texto na posição " + i
					+ " é o texto: '" + texts[i] + "'");
		}
		
		System.out.println("===================================================");
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		
		for(String fruit: fruits){
			System.out.println("A fruta é: " + fruit);
		}

	}

}
