<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*,com.mydojo.Student2" %>

<%
	List<Student2> data = new ArrayList<>();
	data.add(new Student2("Sam Paul",34,"Computer Science",87));
	data.add(new Student2("Michael",12,"Physics",77));
	data.add(new Student2("Amanda",18,"Chemistry",12));
	data.add(new Student2("Jordon",19,"Chemistry",24));
	data.add(new Student2("Robert",27,"History",89));

	pageContext.setAttribute("students",data);
%>

<html>
	<head>
		<title>JSTL Demo</title>
	</head>
	<table border=1>
		<tr>
			<td>Student Name</td>
			<td>Roll No</td>
			<td>Subject</td>
			<td>Score</td>
		</tr>
	<c:forEach var="stud" items="${students}">
		<tr>
		<td></td>
		<td>${stud.rollNo}</td>
		<td>${stud.subject}</td>
		<td>
			<c:if "${stud.score}"<33>
				Fail
			</c:if>
		</td>
		</tr>
	</c:forEach>
	</table>
</html>	
