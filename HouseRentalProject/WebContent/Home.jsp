<%@page import="javax.websocket.Session"%>
<%@ page import="java.sql.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<table border=1 align="center" width="80%">
	<tr>
		<form action="BuyNow.jsp" method="get">
		<td width="50%"><a href="">
		<input type="hidden" value="img1.jpg" name="nm">
		<input type="hidden" value="house1" name="house">
		<input type="hidden" value="$12,00,000" name="price">
		<img src="image/img1.jpg" height="200" value="img1" name="name"></a></td>
		<td><h3>House-1</h3><br>
		<center><input type="submit" value="submit" name="submit"></center>
		</td>
		</form>
	<tr>
	<tr>
		<form action="BuyNow.jsp" method="get">
		<td width="50%"><a href=""><input type="hidden" value="img2.jpg" name="nm"><img src="image/img2.jpg" height="200" value="img1" name="name"></a></td>
		<td><h3>House-2<br><input type="hidden" value="house2" name="house">Price:$12,00,000<input type="hidden" value="12,000" name="price"><br>Type:4BHK</h3><br>
		<center><input type="submit" value="submit" name="submit"></center>
		</td>
		</form>
	<tr>
	<tr>
		<form action="BuyNow.jsp" method="get">
		<td width="50%"><a href=""><input type="hidden" value="img3.jpg" name="nm"><img src="image/img3.jpg" height="200" value="img1" name="name"></a></td>
		<td><h3><input type="hidden" value="house3" name="house"><input type="hidden" value="$9,34,600" name="price">House-3</h3><br>
		<center><input type="submit" value="submit" name="submit"></center>
		</td>
		</form>
	<tr>
	<tr>
		<form action="BuyNow.jsp" method="get">
		<td width="50%"><a href=""><input type="hidden" value="img4.jpg" name="nm"><img src="image/img4.jpg" height="200" value="img1" name="name"></a></td>
		<td><h3><input type="hidden" value="house4" name="house"><input type="hidden" value="$12,00,000" name="price">House-4</h3><br>
		<center><input type="submit" value="submit" name="submit"></center>
		</td>
		</form>
	<tr>
</table>

<a href="Logout">Logout</a>
</body>
</html>