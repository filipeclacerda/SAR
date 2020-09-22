<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de cargo</title>
    </head>
    <body>
        <h1>Pesquisa de cargo</h1>
        <table border="1">
            <tr>
                <th>IDCargo</th>
                <th>Nome</th>
                <th>Editar</th>
                <th>Excluir</th>
                
            </tr>
            <c:forEach items="${cargos}" var="cargo">
                <tr>
                    <td><c:out value="${cargo.idCargo}" /></td>
                    <td><c:out value="${cargo.nomeCargo}" /></td>
                    <td><a href="ManterCargoController?acao=prepararOperacao&operacao=Editar&idCargo=<c:out value="${cargo.idCargo}"/>">Editar</a></td>
                    <td><a href="ManterCargoController?acao=prepararOperacao&operacao=Excluir&idCargo=<c:out value="${cargo.idCargo}"/>">Excluir</a></td>
                </tr>
            </c:forEach>
        </table>
        <form action="ManterCardapioController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir">
        </form>
    </body>
</html>
