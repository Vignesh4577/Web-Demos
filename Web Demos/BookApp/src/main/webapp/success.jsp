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

   String name =(String)request.getAttribute("name");
   out.print("Title is: "+name+"<br>");
   
   Integer bookId = (Integer)request.getAttribute("bookId");
   out.print("Book Id is: "+bookId+"<br>");
   
   out.print("Author is: "+request.getAttribute("author")+"<br>");
   
   out.print("Catagory:  "+request.getAttribute("catagery")+"<br>");
   
   Double price = (Double)request.getAttribute("price");
   out.print("Price is: "+price+"<br>");
   





%>
</body>
</html>