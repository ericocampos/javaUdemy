package aulasUdemy;

/**
 * @author Erico
 * 
 *         17 - Classes and Objects
 *         18 - Methods
 *
 */

class Person {
//	Classes can contain
//	1. Data
//	2. Subroutines (methods)
	
//	Instance variables (data or "state")
	String name;
	int age;
	
	void speak(){
		System.out.println("Hello, my name is: " + name + " and I have " + age + " years!");
	}
	
	void walk() {
		System.out.println("A pessoa " + name + " anda.");
	}
	
	void run() {
		System.out.println("A pessoa " + name + " corre.");
	}
}

public class Aula17_18 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Erico Campos";
		person1.age = 25;
		person1.speak();
		person1.walk();
		
		System.out.println("==============================");
		
		Person person2 = new Person();
		person2.name = "Ana Raquel";
		person2.age = 25;
		person2.speak();
		person2.run();
		
//		System.out.println("O nome da pessoa 1 é: " + person1.name);
//		System.out.println("A idade da pessoa 1 é: " + person1.age);
//		System.out.println("======================================");
//		System.out.println("O nome da pessoa 2 é: " + person2.name);
//		System.out.println("A idade da pessoa 2 é: " + person2.age);

	}

}
