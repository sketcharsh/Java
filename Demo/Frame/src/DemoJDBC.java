import java.sql.*;
public class DemoJDBC 
{
	Connection connection;
	Statement statement;
	DemoJDBC()
	{
		String user = "root";
		String pass = "root";
		String url = "jdbc:mysql://localhost:3306/java";
		try {
		connection = DriverManager.getConnection(url,user,pass);
		statement = connection.createStatement();
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String []args)
	{
		DemoJDBC d1 = new DemoJDBC();
	}
}
