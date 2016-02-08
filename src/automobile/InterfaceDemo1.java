package automobile;

public class InterfaceDemo1 {
	public static void main(String[] args) {
		CarsInterface myInterface = new InterfaceDemo();
		BMWCarsInterface myInterface2 = new InterfaceDemo();
		
		myInterface.engineStart("6 Cyl", true);
		myInterface2.headUpNavigation();
	}
}
