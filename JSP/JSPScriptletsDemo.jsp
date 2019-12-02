<html>
	<head>
		<title>JSP Scriptlets</title>
	</head>
<body>
	This line below was generated using a JSP scriplet<br>
	<%
		out.println("Your IP Address is " + request.getRemoteAddr());
	%>
	<br>This line below was also generated using a JSP Scriptlet<br>
	<jsp:scriptlet>
		out.println("Hello World");
	</jsp:scriptlet>
</body>
</html>
