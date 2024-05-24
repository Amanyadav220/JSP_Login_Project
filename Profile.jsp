<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String name2 = (String) session.getAttribute("name_key");
	%>

	<h3
		style="color: green; font-family: Arial, sans-serif; font-size: 24px; padding: 10px; border: 2px solid green; background-color: #e6ffe6; text-align: center; text-shadow: 1px 1px 2px #000000;">
		<%
		if (name == null) {
		%>
		<%=name2%>
		<%
		} else {
		%>
		<%=name%>
		Login Successfully ...
		<%
		}
		%>
	</h3>
	<p
		style="text-align: center; font-family: Arial, sans-serif; font-size: 18px;">
		To Logout click here</p>
	<br>
	<br>
	<div style="text-align: center;">
		<a href="Logout"
			style="display: inline-block; padding: 10px 20px; font-size: 18px; color: white; background-color: red; text-decoration: none; border-radius: 5px; box-shadow: 2px 2px 5px #888888;">
			Logout </a>
	</div>


</body>
</html>