<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="lp2a4.dao.AlunoDAO"%>
<jsp:useBean id="a" class="lp2a4.bean.Aluno"></jsp:useBean>  
<jsp:setProperty property="*" name="a"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>
<%  
	int i = AlunoDAO.save(a);
	if(i>0) {
		out.print("<p>Aluno foi incluído com sucesso!</p>");
%>
	<%@include file="userform.html"%>
<%
	}else {
		out.print("<p>Desculpe, ocorreu um erro!</p>");
%>
	<%@include file="userform.html"%>
<%
	}
%>
</body>
</html>