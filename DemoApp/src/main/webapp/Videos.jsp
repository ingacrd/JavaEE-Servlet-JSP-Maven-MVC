<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//http 1.1
	response.setHeader("Pagma","no-cache");//http 1.0
	response.setHeader("Expires", "0"); //Proxies

	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
	
%>
VIDEOS
</body>
</html>