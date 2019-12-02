<html>
	<head>
		<title>Form Input Demo 3</title>
	</head>

<form action="FormInputDemo3.jsp" method="post">
Your Name : <input type="text" name="yourName"><br>
Gender : <input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female<br>
<input type="submit" name="submit" value="submit">
</form>
</html>
<%
	if(request.getParameter("yourName")!=null) {
		String name = request.getParameter("yourName");
		String gender = request.getParameter("gender");
		String male = "Male";
		if(gender.equals(male)){
			out.println("His name is " + name);
		} else {
			out.println("Her name is " + name);
		}
	}
%>

