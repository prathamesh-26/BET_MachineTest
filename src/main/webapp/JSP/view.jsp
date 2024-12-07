<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=2px solid black>
<tr>
<th>Select</th>
<th>ID</th>
<th>Course Name</th>
<th>Fee</th>
<th>Instructor</th>
<th colspan="2">Action</th>
</tr>
<c:forEach items="${cr}" var="c">
<tr>
<td><input type="radio" name="id"  value="${c.id}"></td>
<td>${c.id}</td>
<td>${c.coursrName}</td>
<td>${c.fee}</td>
<td>${c.instructor}</td>
<td>
	 <input type="hidden">
	<button type="submit" name="id" value="${c.id}" formaction="edit">EDIT</button>
	</td>
	<td>
	<input type="hidden">
	<button type="submit" class="delete" name="id" value="${c.id}" formaction="delete">DELETE</button>
	</td>
</tr>
</c:forEach>
</table>
</body>
</html>