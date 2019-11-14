<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.time.LocalTime"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Practical 4</title>
</head>
<body>
    <h1>
        Good 
        <%
            LocalTime d = LocalTime.now();
            int currentHour = d.getHour();
            if(currentHour >= 8 && currentHour < 12) {
                out.println("Morning");
            } else if(currentHour <= 16) {
                out.println("Afternoon");
            } else if(currentHour <= 20) {
                out.println("Evening");
            } else {
                out.println("Night");
            }
        %>
    </h1>
</body>
</html>