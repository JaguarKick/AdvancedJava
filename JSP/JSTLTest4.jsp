<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*,com.mydojo.Student" %>

<%
	List<Student> data = new ArrayList<>();
	data.add(new Student("Sam",34,"Computer Science"));
	data.add(new Student("James",12,"Physics"));
	data.add(new Student("Amanda",11,"Chemistry"));
	data.add(new Student("Michael",19,"History"));
	pageContext.setAttribute("students",data);
%>
<html>
	<table border=1>
	<tr>
		<td>Student Name</td>
		<td>Roll No</td>
		<td>Subject</td>
	</tr>

	<c:forEach var="stud" items="${students}">
		<tr>
			<td>${stud.studName}</td><td> ${stud.rollNo}</td><td> ${stud.subject}</td> 
		</tr>
	</c:forEach>
	</table>
</html>
