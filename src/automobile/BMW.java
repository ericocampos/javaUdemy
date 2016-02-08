package automobile;

public class BMW extends Cars {

	public BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing speed of BMW");
	}
	
	public void headupDisplauNavigation(){
		System.out.println("BMW specific Functionality");
	}
	

}
