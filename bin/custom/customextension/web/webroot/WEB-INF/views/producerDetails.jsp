<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Producer</title>
</head>
<body>
    <h1>Producer details:</h1>
    <p>Firstname: ${producer.firstname}</p>
    <p>Lastname: ${producer.lastname}</p>

    <p>
        Concert tours:
        <c:forEach var="tour" items="${producer.concertTours}" varStatus="loop">
            ${tour.name}
            <c:if test="${!loop.last}">,</c:if>
        </c:forEach>
    </p>

</body>
</html>
