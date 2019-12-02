<%!
	String name = "Sam Paul";
	int rollNo = 34;
%>
<jsp:declaration>
	String subject = "Computer Science.";
</jsp:declaration>
<html>
	<%
		out.println("Hello " + name + ". Your roll no is " + rollNo + " and your subject is " + subject);
	%>
</html>
