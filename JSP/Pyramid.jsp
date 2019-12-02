<html>
	<head>
		<title>Print pyramid</title>
	</head>
<%!
	String printPyramid() {
		StringBuffer sb = new StringBuffer();
		for(int i=1;i<10;i++) {
			for(int j=1;j<i;j++) {
				sb.append(j);
			}
			sb.append("<br>");
		}
		return sb.toString();
	}
%>

This is the pyramid I built looks like <br>
<%= printPyramid() %>
</html>
