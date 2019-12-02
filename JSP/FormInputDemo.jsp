<html>
	<head>
		<title>Form Input Demo</title>
	</head>
<form action="FormInputDemo.jsp" method="post">
Name <input type="text" name="yourName"><br>
<input type="submit" value="Submit" name="submit">
</form>
Hello ${param.yourName}, How are you today?
</html>
