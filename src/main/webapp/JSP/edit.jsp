<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="update">
Enter ID : <input type="text" name="id" value="${cr.id}" placeholder="Enter ID : "><br>
Enter Name : <input type="text" name="coursrName" value="${cr.coursrName}" placeholder="Enter Name : "><br>
Enter Fee : <input type="text" name="fee" value="${cr.fee}" placeholder="Enter Fee : "><br>
Instructor Name : <input type="text" name="instructor" value="${cr.instructor}" placeholder="Instructor Name : "> <br>
<button class="form-submit-btn" type="submit">Submit</button>

</form>
</body>
</html>