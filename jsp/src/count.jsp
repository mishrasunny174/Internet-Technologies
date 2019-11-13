<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="sessionCounter" scope="application" value="${sessionCounter+1}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Counter</title>
</head>
<body>
    <h1>Counter</h1>
    <h2>Total Visitors: ${sessionCounter}</h2>
</body>
</html>