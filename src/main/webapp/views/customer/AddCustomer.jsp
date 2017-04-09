<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Добавить нового клиента и его питомца</title>
</head>
<body>
    <form action="${pageContext.servletContext.contextPath}/views/add" method="post">
        <table>
            <tr>
                <td align="right" >Имя клиента : </td>
                <td>
                    <input type="text" name="customerName">
                </td>
            </tr>
            <tr>
                <td align="right" >Имя питомца : </td>
                <td>
                    <input type="text" name="petName">
                </td>
            </tr>
            <tr>
                <td align="right" >Возраст питомца : </td>
                <td>
                    <input type="text" name="petAge">
                </td>
            </tr>
            <tr>
                <td><input type="submit" align="center" value="Submit"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
