<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body style="text-align: center;">
<h1>Enter Your Dog Details Here</h1>
<form action="save" method="post">
<div>Bread Name : <input type="text" name="breadName"> </div>
<div>Enter Color : <input type="text" name="color"> </div>
<div>Dog Gender : <input type="text" name="gender"> </div>
<div>Enter Age : <input type="number" name="age"> </div>
<div>Dog Type : <input type="text" name="breadType"> </div>
<div> <button type="submit">Submit</button> </div>
</form>
<h1>${Result}</h1>
</body>
</html>