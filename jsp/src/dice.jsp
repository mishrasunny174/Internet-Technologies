<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Random"%>

<html>
  <head>
    <title>DICE</title>
  </head>
  <body>
    <h1>You got a <%
        int randomNumber = 1 + (new Random().nextInt(6));
        out.println(randomNumber);
    %></h1>
  </body>
</html>
