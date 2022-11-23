<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="lp2a4.dao.AlunoDAO,lp2a4.bean.*,java.util.*"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Users</title>  
</head>  
<body>  

<h1>Lista de Alunos</h1>  
  
<%
	List<Aluno> list = AlunoDAO.getAllRecords();  
	request.setAttribute("list",list);
%>
  
<table border="1">
	<tr><th>Id</th><th>Nome</th><th>Sobrenome</th><th>Endereço</th><th>Cidade</th><th>Edit</th><th>Delete</th></tr>  
	<c:forEach items="${list}" var="a">
		<tr><td>${a.getId()}</td><td>${a.getNome()}</td><td>${a.getSobrenome()}</td><td>${a.getEndereco()}</td><td>${a.getCidade()}</td>
		<td><a href="editform.jsp?id=${a.getId()}">Editar</a></td>
		<td><a href="deleteuser.jsp?id=${a.getId()}">Deletar</a></td></tr>
	</c:forEach>
</table>
<br/><a href="adduserform.jsp">Adicionar Novo Aluno</a>  

</body>  
</html>