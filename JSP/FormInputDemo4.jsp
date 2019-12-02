<html>
	<head>
		<title>Form Input Demo 4</title>
	</head>
<form action="FormInputDemo4.jsp" method="post">
Your name : <input type="text" name="yourName"><br>
Languages : <input type="checkbox" name="languages" value="C">C
<input type="checkbox" name="languages" value="C++">C++
<input type="checkbox" name="languages" value="Java">Java
<input type="checkbox" name="languages" value="C#.Net">C#.Net
<input type="checkbox" name="languages" value="Php">Php
<input type="checkbox" name="languages" value="Python">Python<br>
<input type="submit" name="submit" value="submit">
</form>
</html>
<%
	if(request.getParameter("yourName")!=null) {
		String name = request.getParameter("yourName");
		String []languages = request.getParameterValues("languages");
		out.println("Hello " + name + ". You know the following languages :-");
		for(String l:languages) {
			out.println(l);
		}
	}
%>
</html>
