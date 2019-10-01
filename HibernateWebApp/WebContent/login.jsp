<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" buffer="16kb" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%@ include file = "header.html" %>
<marquee >THIS IS SIGN UP PAGE</marquee>
<div>
<table align=center border=2px  >
	<form action="checkuser" method="post">
	<tr>	<p>
<td>	USERNAME:		 <input type="text" name="username" placeholder="enter username"></td>
		</p></tr>
	<tr>	<p>
<td>	PASSWORD:		<input type="password" name="passwd" placeholder="enter password"></td>
		</p></tr>
<tr>	<p>
		<td>	<input type="submit" value="sign in "></p></td>
		</tr>
			

			
	</form>
	
</table>
</div>
<%@ include file = "footer.html" %>
</body>
</html>