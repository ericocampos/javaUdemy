class Car {
	int year;
	private String make;
	int speed;
	int gear;
	
	public Car () {
//		this(1, 0);
		gear = 1;
		speed = 0;
		
		System.out.println("Executing constructor without arguments...");
	}
	
	public Car (int startGear, int startSpeed) {
		gear = startGear;
		speed = startSpeed;
		
		System.out.println("Executing constructor with arguments...");
	}
	
	 int getyear() {
		//System.out.println("The year is: " + year);
		return year;
	}
	 
	 void setMake(String make) {
		 this.make = make;
	 }
	 
	 String getMake() {
		 return make;
	 }
	 
}


public class ClassDemo {

	public static void main(String[] args) {
		Car c1 = new Car();
		//Car c1 = new Car(1, 0);
		c1.year = 2010;
		
		String mk = "BMW";
		c1.setMake(mk);
		
		int yearOfCar = c1.getyear();
		String mk1 = c1.getMake();
		
		System.out.println("The make of car is: " + mk1 + " The year is: " + yearOfCar);
		
		//System.out.println("The make of car is: " + c1.make + " and year is: " + c1.year);
	}
}
