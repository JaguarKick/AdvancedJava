<%!
	String []colors = {"Blue","Red","Yellow","White","Purple","Green","Orange","Cyan"};
%>

<html>
	<head>
		<title>Dynamic Page Demo</title>
	</head>
	<body bgcolor="black">
<%
	for(String s:colors) {
		out.println("<font color="+s+">Hello World.</font><br>");
	}
%>
</body>
</html>
