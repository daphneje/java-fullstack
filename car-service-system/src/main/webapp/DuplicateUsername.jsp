<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Page</title>
</head>
<body>
	<h1>Username already exists. Please choose a different username.</h1>
	<form action="/car-service-system/CustomerRegister">
		<table>
			<tr>
			<td>Name</td>
			<td><input type="text" name="name" required></td>
			</tr>
			
			<tr>
			<td>Username</td>
			<td><input type="text" name="username" required></td>
			</tr>
			
			<tr>
			<td>Password</td>
			<td><input type="password" name="password" required></td>
			</tr>
			
			<tr>
			<td>Confirm Password</td>
			<td><input type="password" name="confirmPassword" required></td>
			</tr>
			
			<tr>
			<td>Email</td>
			<td><input type="text" name="email" required></td>
			</tr>

			<tr>
			<td><input type="submit" value="register"></td>
			</tr>
		</table>
	</form>
</body>
</html>