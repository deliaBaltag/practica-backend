<%--
  Created by IntelliJ IDEA.
  User: Delia
  Date: 7/7/2015
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Spring MVC and List Example</h2>
<h3>Comentarii</h3>
<c:if test="${not empty comments}">

  <ul>
    <c:forEach var="listValue" items="${comments}">
      <li>${listValue}</li>
    </c:forEach>
  </ul>

</c:if>

</body>
</html>
