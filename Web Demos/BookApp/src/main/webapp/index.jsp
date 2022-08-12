<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="bookServlet">
      Name : <input type="text" name="tittel"><br>
      BookId : <input type="text" name="bookId"><br>
      Author : <input type="text" name="author"><br>
      Catagery : <input type="text" name="catagery"><br>
      Price : <input type="text" name="price"><br>
      <input type="submit" value="Add"><br>
    </form>

</body>
</html>