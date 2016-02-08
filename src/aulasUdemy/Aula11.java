package aulasUdemy;

import java.util.Scanner;

/**
 * @author Erico
 * 
 *         Getting user import
 *
 */

public class Aula11 {

	public static void main(String[] args) {
		// Criando objeto scanner
		Scanner input = new Scanner(System.in);

		// Prompt de comando
		System.out.println("Digite um texto: ");
		String line = input.nextLine();

		// O que foi digitado
		System.out.println("Você digitou: " + line);

	}

}
