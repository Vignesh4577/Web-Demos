<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<%
	String username = (String) request.getAttribute("username");
	out.print("Welcome " + username);
	%>
	<form action="movieServlet">
		Enter Choice <select name="langauge">
			<option value="select">==select==</option>
			<option value="kannada">kannada</option>
			<option value="english">english</option>
			<option value="telugu">telugu</option>
			<option value="urdhu">urdhu</option>

			<input type="submit" value="showMovies">
		<br>
	</form>




</body>
</html>