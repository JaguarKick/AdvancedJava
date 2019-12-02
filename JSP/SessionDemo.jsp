<%@ page import="java.util.*" %>

<html>
	<head>
		<title>Session Demo</title>
	</head>

<form action="SessionDemo.jsp" method="post">
Add new player name : <input type="text" name="playerName"> <input type="submit" name="submit" value="Add Player"><br>
</form>

<hr>
Players are :- <br>
<%
	List<String> playerList = (List<String>)session.getAttribute("listOfPlayers");
	if(playerList==null) {
		playerList = new ArrayList<String>();
		session.setAttribute("listOfPlayers",playerList);
	}
	String player = request.getParameter("playerName");
	if(player!=null) {
		playerList.add(player);
		response.sendRedirect("SessionDemo.jsp");
	}
%>
<ul>
<%
	for(String p:playerList) {
		out.println("<li>" + p);
	}
%>
</ul>
</html>
