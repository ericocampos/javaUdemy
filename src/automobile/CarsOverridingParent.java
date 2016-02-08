package automobile;

public class CarsOverridingParent {
	
	public void engineStart(int cyl){
		System.out.println("I am from the parent class");
	}

	public void increaseSpead(){
		System.out.println("I am the increase spead from the parent class.");
	}
	
	public static void staticExample(){
		System.out.println("I am the static method from the parent.");
	}
}
