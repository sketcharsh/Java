import java.sql.*;
public class JDBCFile 
{
	static Connection connection;
	static Statement statement;
	JDBCFile()
	{
		String user="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/java";
		try
		{
//		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(url,user,pass);
		statement = connection.createStatement();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	public static void main(String[] args) 
	{
		JDBCFile f1 = new JDBCFile();
	}
}
