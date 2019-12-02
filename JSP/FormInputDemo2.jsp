<html>
	<head>
		<title>Form Demo - Drop Down List</title>
	</head>
<form action="FormInputDemo2.jsp" method="post">
Game Title <input type="text" name="gameTitle"><br>
Platform : 
<select name="platform">
<option value="PS4 Pro">PS4
<option value="XBOX One">XBox One
<option value="PC">PC
</select><br>
<input type="submit" name="submit" value="Submit">
</form>
</html>

You're playing ${param.gameTitle} which is a title available on ${param.platform}.<br>
</html>
