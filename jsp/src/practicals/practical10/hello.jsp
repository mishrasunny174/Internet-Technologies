<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Practical 10</title>
</head>
<body>
    <h1>Practical 10</h1>
    <h1>Hello, <c:out value="${param.name}"/></h1>
    <form action="final.jsp" method="post">
        <label for="product">Product you wanna buy: </label>
        <input type="text" name="product" id="product">
        <input type="hidden" name="name" value="<c:out value='${param.name}'/>">
        <br>
        <button type="submit" name="submit" value="submit">Submit</button>
    </form>
</body>
</html>