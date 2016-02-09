package aulasUdemy;

import java.util.Scanner;

/**
 * @author Erico
 * 
 *         Switch
 *
 */

public class Aula13 {

	private static Scanner scanner;
	private static String text;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Digite um comando: ");
		text = scanner.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine Started.");
			break;
			
		case "stop":
			System.out.println("Machine Stoped;");
			break;
			
		default:
			System.out.println("Command not recognized. The system will be shut down!!");
		}

	}

}
