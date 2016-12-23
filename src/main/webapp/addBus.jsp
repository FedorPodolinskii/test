<%--
  Created by IntelliJ IDEA.
  User: Super-Fedya
  Date: 22.12.2016
  Time: 0:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Добавить автобус</title>
</head>
<body>
<h2>Добавить автобус.</h2>



<form:form method="post" modelAttribute="busForm" action="${userActionUrl}">
    <form:input path="name" type="text" /> <!-- bind to user.name-->
    <form:errors path="name" />
</form:form>

<%--<form action="//addBus"  name="newBusFilled" method="post">
    Выберите номер нового автобуса:<input name="newBusId" type="number"/>
    Выберите количество мест в новом автобусе:<input name="newBusCapacity" type="number"/>
    Выберите станции следования нового автобуса:<select id="" name="newBusStations" multiple="multiple" >

 </select>
</form>--%>

</body>
</html>
