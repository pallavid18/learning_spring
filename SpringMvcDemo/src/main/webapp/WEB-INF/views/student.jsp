<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Jsp</title>
</head>
<body>
	<h1>Student List</h1>
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<c:forEach var="student" items="${studentlist}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.age}</td>
			</tr>
		</c:forEach>
	</table>
	
<!-- ID : ${student.id }<br>
	 Name : ${student.name }<br>
	 Age : ${student.age }
 -->
</body>
</html>