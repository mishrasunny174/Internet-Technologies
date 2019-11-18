<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="custom" uri="https://mishrasunny174.cf/jsp/cutomtaglib"%>
<c:set var="sessionCounter" scope="application" value="${sessionCounter+1}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Practical 6</title>
</head>
<body>
    <h1><custom:hello name="Sunny"/></h1>
    <h1><custom:choco texture="chewy"/></h1>
</body>
</html>