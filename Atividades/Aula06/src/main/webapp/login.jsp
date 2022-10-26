<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:useBean id="login" class="java.lang.String"></jsp:useBean> --%>
<%
	String msg = request.getAttribute("mensagem");
	
	out.println(msg);
%>
</body>
</html>