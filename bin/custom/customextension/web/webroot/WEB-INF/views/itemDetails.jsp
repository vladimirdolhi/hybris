<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Item</title>
</head>
<body>
    <h1>Item details:</h1>
    <p>Name: ${item.name}</p>
    <p>Enum value: ${item.enumProperty}</p>
    <p>Map:
    <ul>
        <c:forEach items="${item.mapProperty}" var="entry">
            <li>
                Key: ${entry.key};
                Value: ${entry.value};
            </li>
        </c:forEach>
    </ul>
    </p>

    <p>
        List:
        <c:forEach var="num" items="${item.listProperty}" varStatus="loop">
            ${num}
            <c:if test="${!loop.last}">,</c:if>
        </c:forEach>
    </p>

</body>
</html>
