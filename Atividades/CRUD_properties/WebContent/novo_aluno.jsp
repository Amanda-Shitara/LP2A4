<%@ page import="lp2a4.controller.CommandEnum"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="lp2a4.modelo.AlunoPOJO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aluno CRUD</title>
</head>
<body>
<!-- Configurar o escopo com request permite receber o atributo colocado no request -->
<!-- o id deve ter o mesmo nome do atributo configurado no request -->
<jsp:useBean id="aluno" class="lp2a4.modelo.AlunoPOJO" scope="request"></jsp:useBean>

<form id="create_form" action="./controller">
	<input type="hidden" name="acao" id="acao" value="<%=CommandEnum.CREATE%>"/>
	<table border="1">
		<tr>
			<td>Matrícula : </td>
			<td>
				<input class="edicao" type="text" id="matricula" name="matricula"/>
			</td>
		</tr>
		<tr>
			<td>Nome : </td>
			<td>
				<input class="edicao" type="text" id="nome" name="nome"/>
			</td>
		</tr>
		<tr>
			<td>Endereço : </td>
			<td>
				<input class="edicao" type="text" id="endereco" name="endereco"/>
			</td>
		</tr>
		<tr>
			<td>Data Ingresso : </td>
			<td>
				<input class="edicao" type="text" id="dataIngresso" name="dataIngresso"/>
			</td>
		</tr>
		<tr>
			<td>Data Término : </td>
			<td>
				<input class="edicao" type="text" id="dataConclusao" name="dataConclusao"/>
			</td>
		</tr>
	</table>
	<input type="submit" value="Confirmar edição!"/>
</form>
</body>
</html>