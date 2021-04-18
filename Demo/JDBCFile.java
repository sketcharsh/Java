import java.sql.*;
public class JDBCFile 
{
	static Connection connection;
	static Statement statement;
	JDBCFile()
	{
		String user="mscfy36";
		String pass="sumo@123";
		String url="jdbc:mysql://128.66.203.247/mscfy36";

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
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
