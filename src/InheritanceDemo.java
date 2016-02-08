import automobile.BMW;
import automobile.Cars;


public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		System.out.println(c1.publicSpeed);
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
//		System.out.println(bmw1.speed);
		bmw1.headupDisplauNavigation();
		

	}

}
