<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=1" width="50%" align="center">
<form action="Booking">
<tr>
	<td colspan=2><img src="image/<%=request.getParameter("nm") %>" width="100%"></td>
</tr>
<tr>
	<td>Property Name :</td>
	<td><input type="text" value="<%= request.getParameter("house") %>" name="prop_name" readonly="true"></td>
</tr>
<tr>
	<td>Property Price :</td>
	<td><input type="text" value="<%= request.getParameter("price") %>" name="price" readonly="true"></td>
</tr>
<tr>
	<td>Buyer Name :</td>
	<td><input type="text" name="buyer_name"></td>
</tr>
<tr>
	<td>Buyer Email :</td>
	<td><input type="text" value="<%= session.getAttribute("ssn") %>" name="email" readonly="true"></td>
</tr>
<tr>
	<td>Buyer Address :</td>
	<td><input type="text" name="buyer_add"></td>
</tr>
<tr>
	<td>Phone Number :</td>
	<td><input type="text" name="phone"></td>
</tr>
<tr>
	<td colspan=2><center><input type="submit" value="Submit"></center></td>
</tr>
</form>
</table>
<a href="Logout">Logout</a>
</body>
</html>