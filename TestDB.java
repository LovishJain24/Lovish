import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestDB {

	public static void main(String[] args) {
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/lovish","root", "root");
		
				System.out.println("Connected");
				Statement statement=connection.createStatement();
				System.out.println("Connected");
				//ResultSet resultSet=statement.executeQuery("SELECT * FROM lovish.user");
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter data: ");
				int id = scanner.nextInt();
				String name = scanner.next();
				String query = "INSERT INTO `lovish`.`user` (`id`, `name`) VALUES('"+id+"','"+name+"')";
				statement.executeUpdate(query);
				System.out.println("Data Inserted Successfully");
				
		}
		catch (Exception e)  {
			System.out.println(e);
		}
		
	}
	
}

		
