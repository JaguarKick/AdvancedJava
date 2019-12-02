<html>
	<head>
		<title>Dynamic Page</title>
	</head>

<%! int fontSize=6; %>
<%
	for(int i=1;i<=fontSize;i++) {
		out.println("<h"+i+">Dynamic</h"+i+">");
	}
%>
</html>
