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
	<h1>${Result2}</h1>
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
	
	<br> <br>
	
	If you want To Edit / Update or Delete the Data Click bellow Button
	<div> <a href="Fifth.jsp"> <button type="button">Make Changes...!..?</button> </a> </div>
	
	
	
</body>
</html>