<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <p>Sender: </p>
    <input type="text" name="newSender" value="${contactRequest.sender}"/>
    <br/>
    <p>Message: </p>
    <textarea name="newMessage">${contactRequest.message}</textarea>
    <br/>
    <input type="submit" value="Send"/>
</form>
</body>
</html>
