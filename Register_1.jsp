<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center" style='color: Blue'>SignUp Form ...</h2>
	<form action="Register" method="post">
		User_Name : <input type="text" name="name"
			Placeholder="Enter your Username"><br> <br> Email :
		<input type="text" name="email" Placeholder="Enter your Username"><br>
		<br> Password : <input type="password" name="pass"
			Placeholder="Enter your Password"> <br> <br>
		Gender: <input type="radio" name="gender" value="Male" />Male <input
			type="radio" name="gender" value="Female" />Female<br> <br>
		State: <select name="city">
			<option>Select City</option>
			<option>Rajasthan</option>
			<option>Haryana</option>
			<option>U.K</option>
			<option>M.P</option>
			<option>U.P</option>
		</select> <br> <br> <input type="submit" value="Register" />
	</form>
</body>
</html>