<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String s=(String)session.getAttribute("uname");
	if(s.isEmpty())
	{
		out.print("Session not created");
		
	}
	else
	{
		%><b>Welcome,</b><%=s %>
		<table border="1">
					<tr>
						<td>Name</td>
						<td>Gender</td>
						<td>Email</td>
						<td>Password</td>
					</tr>
	<%
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://128.66.203.247/it1718b14", "it1718b14", "sumo@123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from demo");
			while(rs.next())
			{
				%>
				<tr>
					<td><%=rs.getString(1) %></td>
					<td><%=rs.getString(2) %></td>
					<td><%=rs.getString(3) %></td>
					<td><%=rs.getString(4) %></td>
					<td><a href="Edit.jsp?email=<%= rs.getString(3) %>">Edit</a></td>
					<td><a href="Delete.jsp?email=<%= rs.getString(3) %>">Delete</a></td>
				</tr>
				
			<%}
		}
		
		catch(Exception e)
		{
			out.print(e);
		}
	}

%>
</table>
</body>
</html>