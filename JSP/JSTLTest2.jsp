<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String []cities = {"Noida","Gurgaon","New Delhi","Ghaziabad",};
	pageContext.setAttribute("ncrCities",cities);
%>

<html>
	<c:forEach var="city" items="${ncrCities}">
		${city}<br>
	</c:forEach>
</html> 
