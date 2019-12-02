<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*,com.mydojo.CSGOPlayer" %>

<%
	List<CSGOPlayer> data = new ArrayList<>();
	data.add(new CSGOPlayer("tigerbeetle",false));
	data.add(new CSGOPlayer("ladybeetle",false));
	data.add(new CSGOPlayer("KennyS",true));
	data.add(new CSGOPlayer("NadeKing",true));
	data.add(new CSGOPlayer("WarOwl",false));

	pageContext.setAttribute("players",data);
%>

<html>
	<head>
		<title>CSGO player</title>
	</head>
	<table border=1>
		<tr>
			<td>Player Name</td>
			<td>Legendary Eagle</td>
		</tr>
		<c:forEach var="csplayer" items="${players}">
			<tr>
				<td>${csplayer.playerName}</td>
				<td><c:if test="${csplayer.LE}">
					Legendary Eagle
				</c:if>
				<c:if test="${not csplayer.LE}">
					Gold Nova
				</c:if></td>
			</tr>
		</c:forEach>
	</table>
</html>
		
