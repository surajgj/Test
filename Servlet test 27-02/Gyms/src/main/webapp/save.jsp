<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gym Details</title>
<style>
input {
	padding: 10px;
	margin: 8px;
	s
}

button {
	width: 140px;
	height: 35px;
	margin: 10px;
}
</style>
</head>
<body style="text-align: center;">
	<form action="save" method="post">
		
		<div>
			<h1>Enter Gym Details</h1>
		</div>
		
		<div>
			<input type="text" placeholder="Enter Gym Name" name="gym">
		</div>
		<div>
			<input type="text" placeholder="Enter Address" name="address">
		</div>
		<div>
			<input type="text" placeholder="Enter Trainer Name" name="name">
		</div>
		<div>
			<input type="text" placeholder="Enter Contact No" name="number">
		</div>
		<div>
			<input type="text" placeholder="Enter pincode" name="pinCode">
		</div>
		<div>
			<button type="submit">Submit</button>
		</div>
	</form>
</body>
</html>