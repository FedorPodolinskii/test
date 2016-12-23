<%--
  Created by IntelliJ IDEA.
  User: Super-Fedya
  Date: 23.12.2016
  Time: 5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<% List busList = (List)request.getAttribute("busListAttribute");%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <%=busList%>
    <c:forEach items="${busList}" var="employee">
        <tr>
            <td>Employee ID: <c:out value="${}"/></td>
            <td>Employee Pass: <c:out value="${}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
