<html>
	<head>
		<title>Cookies Using JSP</title>
	</head>

<%
	String loc = "";
	Cookie[] cookies = request.getCookies();
	if(cookies!=null) {
		for(Cookie c:cookies) {
			out.println("Found some cookies.");
			if("myDojo.location".equals(c.getName())) {
				loc = c.getValue();
				out.println("<h1>"+loc+"</h1>");
				break;
			} else {
				out.println("No cookies found. You're visiting this site for the first time.");
			}
		}
	}
%>

<form action=CookiesDemo.jsp method=POST>
Location : <input type=text name=location> <br>
<input type=submit name=submit value=submit>
</form>
</html>

<%
	if(request.getParameter("location")!="") {
		loc = request.getParameter("location");
	}

	Cookie cookie = new Cookie("myDojo.location",loc);
	cookie.setMaxAge(60*60);
	response.addCookie(cookie);
%>


