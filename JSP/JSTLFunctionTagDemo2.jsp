<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="data" value="Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune"/>
<c:set var="planets" value="${fn:split(data,',')}"/>
<c:forEach var="planet" items = "${planets}">
	${planet}<br>
</c:forEach>

