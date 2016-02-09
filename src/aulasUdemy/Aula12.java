package aulasUdemy;

import java.util.Scanner;

/**
 * @author Erico
 * 
 *         Do..While Loops
 *
 */

public class Aula12 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int value;
		do {
			System.out.println("Digite um número: ");
			value = scanner.nextInt();
		} while (value != 5);

		System.out.println("Você digitou o número correto: " + value);

	}

}
