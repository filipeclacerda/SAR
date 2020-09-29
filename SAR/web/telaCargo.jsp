<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<html>
<title>SAR</title>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <h1>
        Manter Cargo - ${operacao}
    </h1>
    <form action="ManterCargoController?acao=confirmarOperacao&operacao=${operacao}" method="post" name="frmManterCargo">
        <table>
            <tr>
                <td>
                    Codigo do Cargo:
                </td> <td><input type="text" name="idCargo" value="${cargo.idCargo}" <c:if test="${operacao != 'Incluir'}"> readonly</c:if></td>
            </tr>
            <tr>
                <td>
                Nome Cargo:
                </td>
            <td><input type="text" name="nomeCargo" value="${cargo.nomeCargo}" <c:if test="${operacao != 'Excluir'}"> readonly</c:if></td>
            </tr>
            <input type="submit"/>
        </table>
    </form>

</body>

</html>