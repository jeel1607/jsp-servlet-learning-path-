<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Display Student</title>
</head>
<body bgcolor="lightblue">
    <h2>Hello ${students}</h2>
    <p>How are you?</p>
    <c:forEach items="${students}" var="s">
      ${s}<br>
      </c:forEach>
</body>
</html>
