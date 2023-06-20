<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Items</title>
</head>
<body>
<c:forEach var="item" items="${items}">
    <li>
        <a href="${pageContext.servletContext.contextPath}/items/${item.name}">${item.name}</a>
    </li>
</c:forEach>
</body>
</html>
