<%@page import="com.ingaru.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		Student s1 = (Student)request.getAttribute("student"); //ctrl space to import
	out.println(s1);
	%>
</body>
</html>