<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registeredServlate">
		Enter Name :    <input type="text" name="username" placeholder="Enter name"><br>
		Enter StudentId :   <input type="text" name="studentId" placeholder="Enter studentId"><br>
		Enter City :    <input type="text" name="city" placeholder="Enter city"><br>
		Choose Language<select name="langauage">
			<option value="select">---select---</option>
			<option value="java">Java</option>
			<option value="jSP">JSP</option>
			<option value="Spring">Spring</option>
			<option value="Hibernate">Hibernate</option>
		</select><br>
		Enter Hobby
		<input type="checkbox" value="music" name="hobby">Music
		<input type="checkbox" value="dance" name="hobby">Dance
		<input type="checkbox" value="sports" name="hobby">Sports
		<input type="checkbox" value="reading" name="hobby">Reading
		
		<input type="submit" value="Add"><br>
	</form>
</body>
</html>