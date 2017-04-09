<%--
  Created by IntelliJ IDEA.
  User: V
  Date: 05.04.2017
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Pet Clinic!</title>
</head>
<body>
<tr valign="top">
    <a href="${pageContext.servletContext.contextPath}/views/customer/ViewCustomers.jsp">Показавть всех клиентов</a><br>
    <a href="${pageContext.servletContext.contextPath}/views/customer/AddCustomer.jsp">Добавить нового клиента</a><br>
    <a href="${pageContext.servletContext.contextPath}/views/customer/ViewCustomers.jsp">Поиск клиента</a>
</tr>
</body>
</html>
