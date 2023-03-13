<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
	<h1>${Error}</h1>
	<h1>Here is your Data</h1>
	<table >
	<c:forEach var="allData" items="${AllData}">
		<tr style="text-align: center;">
		<td>${allData.id}</td>
		<td>${allData.breadName}</td>
		<td>${allData.color}</td>
		<td>${allData.gender}</td>
		<td>${allData.age}</td>
		<td>${allData.breadType}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>