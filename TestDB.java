import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {

	public static void main(String[] args) {
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lovish", "root", "root");
		
				System.out.println("Connected");
		}
		catch (Exception e)  {
			System.out.println(e);
		}
		
	}
	
}

		
