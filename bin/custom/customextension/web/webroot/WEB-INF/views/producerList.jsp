<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Producers</title>
</head>
<body>
<c:forEach var="producer" items="${producers}">
    <li>
        <a href="${pageContext.servletContext.contextPath}/producers/${producer.code}">${producer.firstname} ${producer.lastname}</a>
    </li>
</c:forEach>
</body>
</html>
