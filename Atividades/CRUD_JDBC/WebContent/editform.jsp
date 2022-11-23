<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="lp2a4.dao.AlunoDAO,lp2a4.bean.Aluno"%>  
<!DOCTYPE html>  
<html>  
<head>  
<meta charset="UTF-8">
<title>Edit Form</title>  
</head>  
<body>  
<%  
	String id = request.getParameter("id");  
	Aluno a = AlunoDAO.getRecordById(Integer.parseInt(id));  
%>
  
<h1>Edit Form</h1>  
<form action="edituser.jsp" method="post">  
	<input type="hidden" name="id" value="<%=a.getId() %>"/>
	<table>  
		<tr><td>Nome:</td><td>  
		<input type="text" name="nome" value="<%= a.getNome()%>"/></td></tr>  
		<tr><td>Sobrenome:</td><td>
		<input type="text" name="sobrenome" value="<%= a.getSobrenome()%>"/></td></tr>  
		<tr><td>Endereço:</td><td>
		<input type="text" name="endereco" value="<%= a.getEndereco()%>"/></td></tr>  
		<tr><td>Cidade:</td><td>
		<input type="text" name="cidade" value="<%= a.getCidade()%>"/></td></tr>
		<tr><td colspan="2"><input type="submit" value="Editar Aluno"/></td></tr>  
	</table>  
</form>  

</body>  
</html>