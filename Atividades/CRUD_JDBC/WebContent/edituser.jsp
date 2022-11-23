<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="lp2a4.dao.AlunoDAO"%>
<jsp:useBean id="a" class="lp2a4.bean.Aluno"></jsp:useBean>  
<jsp:setProperty property="*" name="a"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
</head>
<body>
<%  
	int i = AlunoDAO.update(a);  
	response.sendRedirect("viewusers.jsp");  
%>
</body>
</html>