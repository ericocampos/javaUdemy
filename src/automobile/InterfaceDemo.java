package automobile;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {

	@Override
	public void engineStart(String engineType, boolean isKeyLes) {
		System.out.println("This is the implementation");
	}

	@Override
	public void headUpNavigation() {
		System.out.println("Implementation of headUpNavigation");
		
	}

}
