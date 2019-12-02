<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="data" value="Earth is the third planet of our Solar System" />
Length of the String is : ${fn:length(data)}<br>
${fn:toUpperCase(data)}<br>

