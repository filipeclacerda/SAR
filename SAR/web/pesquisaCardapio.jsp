<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa de items do cardapio</title>
    </head>
    <body>
        <h1>Pesquisa de items do cardapio</h1>
        <table border="1">
            <tr>
                <th>IDCardapio</th>
                <th>Nome Cardapio</th>
                <th>Preco</th>
                <th>Editar</th>
                <th>Excluir</th>
                
            </tr>
            <c:forEach items="${cardapios}" var="cardapio">
                <tr>
                    <td><c:out value="${cardapio.idCardapio}" /></td>
                    <td><c:out value="${cardapio.nomeCardapio}" /></td>
                    <td><c:out value="${cardapio.preco}" /></td>
                    <td><a href="ManterCardapioController?acao=prepararOperacao&operacao=Editar&idCardapio=<c:out value="${cardapio.idCardapio}"/>">Editar</a></td>
                    <td><a href="ManterCardapioController?acao=prepararOperacao&operacao=Excluir&idCardapio=<c:out value="${cardapio.idCardapio}"/>">Excluir</a></td>
                </tr>
            </c:forEach>
        </table>
        <form action="ManterCardapioController?acao=prepararOperacao&operacao=Incluir" method="post">
            <input type="submit" name="btnIncluir" value="Incluir">
        </form>
    </body>
</html>
