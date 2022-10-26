<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soma</title>
</head>
<body>
<%
	int v1 = Integer.parseInt(request.getParameter("v1"));
	int v2 = Integer.parseInt(request.getParameter("v2"));
	
	out.println("O resultado da soma é " + (v1 + v2));
	
	//RequestDispacher rd = request.getRequestDispacher("./index.html");
	//rd.forward(request, response);
%>
</body>
</html>