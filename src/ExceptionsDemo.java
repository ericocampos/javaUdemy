import java.sql.SQLException;


public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		try {
			System.out.println("Line before withdraw method");
			acc.withdraw(100);
			System.out.println("Line after withdraw method");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Try again later!");
		}
		finally {
			System.out.println("Allways execute");
		}
	}

}
