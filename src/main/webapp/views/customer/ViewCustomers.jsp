<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Список клиентов</title>
</head>
<body>
<a href="${pageContext.servletContext.contextPath}/views/MainFrame.jsp">На главную страницу</a>

<c:out value="${customers}" default="-1"></c:out>
<table>
    <tr>
        <td>Номер клиента</td>
        <td>Клиент</td>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr valign="top">
            <td>${customer.key} ${customer.value}</td>
            <td>
                <a href="${pageContext.servletContext.contextPath}/customer/edit?id=${customer.id}">Редактировать</a>
                <a href="${pageContext.servletContext.contextPath}/customer/delete?id=${customer.id}">Удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.servletContext.contextPath}/views/MainFrame.jsp">На главную страницу</a>

</body>
</html>
