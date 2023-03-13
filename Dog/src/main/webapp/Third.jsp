<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${Result1}</h1>
	<h4>${Data}</h4>
	<br>
	<h1>Click below Button to Display All Data Present in your
		Database</h1>
	<form action="read" method="get">
		<div>
			<button type="submit">Display</button>
		</div>
	</form>
	<h1>${Result2}</h1>
</body>
</html>