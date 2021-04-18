<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String em = request.getParameter("email");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://128.66.203.247/it1718b14", "it1718b14", "sumo@123");
			Statement stt = con.createStatement();
			stt.executeUpdate("DELETE FROM demo WHERE email = '"+ em +"'");
			stt.close();
			con.close();
			response.sendRedirect("Display.jsp");
		}
		catch(Exception e)
		{
		
		}
%>
</body>
</html>