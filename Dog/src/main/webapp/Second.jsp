<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${Result}</h1>
	Click the Below Button to Search the Data
	<form action="find" method="get">
		<div>Enter id to be Searched : <input type="number" name="id"> </div>
		<div>
			<button type="submit">Search</button>
		</div>
	</form>
	<h1>${Result1}</h1>
</body>
</html>