<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
	<form action="update" method="put">
	<div>Enter id to be Update : <input type="number" name="id"> </div>
	<div>Enter type to Update : <input type="text" name="type"> </div>
	<div> <button type="submit">Update</button> </div>
	</form>
	<br>
	<h1>${Result3}</h1>
	
	<br> <br>
	
	<form action="delete" method="put">
	<div>Enter color  : <input type="text" name="color"> </div>
	<div>Enter age: <input type="number" name="age"> </div>
	<div> <button type="submit">Delete... !</button> </div>
	</form>
	<br>
	<h1>${Result4}</h1>
</body>
</html>