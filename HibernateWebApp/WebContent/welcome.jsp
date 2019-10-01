<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%@ include file = "header.html" %>

<%-- <%--Declartion --%>
<%-- <%! int count=0;
String name;
public String getName()
{
	return name;
}
public void setName(String name){
	this.name=name;
}



--%> 





<%-- <%--Scriptlet --%>

<%--
	String username = request.getParameter("username");
//	setName(username);
	session.setAttribute("uname", username);
	session.setMaxInactiveInterval(5);
	String productUrlEnc=response.encodeURL("product.jsp");




--%> 
<c:set var="uname" value="${param.username }" scope="session"></c:set>
<c:url var="productUrlEnc" value="product.jsp"></c:url>
<p> dear${param.username} Welcome to online shopping of zensar</p>
<p>Your Session time out periods is <%-- <%= session.getMaxInactiveInterval() %> --%> ${pageContext.session.maxInactiveInterval}seconds</p>
<p>to view and purchase products<a href="${productUrlEnc}">Click here</a></p>
<%-- <ol> 
<li> <%= request.getParameter("book1") %></li>
<li> <%= request.getParameter("book2") %></li>

</ol> --%>

<%@ include file = "footer.html" %>
</body>
</html>