<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de funcionarios</title>
    </head>
    <body>
        <h1>Pesquisa de funcionarios</h1>
        <table border="1">
            <tr>
                <th>idFuncionario</th>
                <th>Nome</th>
                <th>Telefone</th>
                <th>idCargo</th>
                
            </tr>
            <c:forEach items="${funcionarios}" var="funcionario">
                <tr>
                    <td><c:out value="${funcionario.idFuncionario}" /></td>
                    <td><c:out value="${funcionario.nome}" /></td>
                    <td><c:out value="${funcionario.telefone}" /></td>
                    <td><c:out value="${funcionario.idCargo}" /></td>
                    <td><a href="ManterFuncionarioController?acao=prepararOperacao&operacao=Editar&idFuncionario=<c:out value="${funcionario.idFuncionario}"/>">Editar</a></td>
                    <td><a href="ManterFuncionarioController?acao=prepararOperacao&operacao=Excluir&idFuncionario=<c:out value="${funcionario.idFuncionario}"/>">Excluir</a></td>
                </tr>
            </c:forEach>
        </table>
        <form action="ManterCardapioController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir">
        </form>
    </body>
</html>
