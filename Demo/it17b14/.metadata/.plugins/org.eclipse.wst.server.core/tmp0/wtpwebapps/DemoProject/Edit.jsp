<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%  String em = request.getParameter("email");
	String nm = "";
	String email = "";
	String pass = "";
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://128.66.203.247/it1718b14", "it1718b14", "sumo@123");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from demo where email='"+em+"'");
		while(rs.next())
		{
			nm = rs.getString(1);
			email = rs.getString(3);
			pass = rs.getString(4);
		}
	}
	
	catch(Exception e)
	{
		out.print(e);
	}
	%>
	<table align="center">
	<form name="info" action="Delete" method="get">
	<tr>
	<td>
		<input type="text" name="name" value="<%= nm %>"/>
	</td>
	</tr>
	<tr>
	<td>
		<input type="radio" name="gender" value="Male">Male
		<input type="radio" name="gender" value="Female">Female
		</td>
	</tr>
	<tr>
	<td>
		<input type="email" name="email" value="<%= em %>"/>
		</td>
	</tr>
	<tr>
	<td>
		<input type="text" name="password" value="<%= pass %>"/>
	</td>
	</tr>
	<tr>
	<td>
		<input type="submit" value="Upadate">
		</td>
		</tr>
	</form>
	</table>
	
</body>
</html>