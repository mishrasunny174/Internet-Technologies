<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Random"%>

<%
    String memes[] = {"1.jpg","2.jpg", "3.jpg", "4.jpg", "5.jpg", "pickle.jpg"};
    String memeName = memes[(new Random().nextInt(6))];
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Meme Server 2.0</title>
</head>
<body>
    <nav class="nav justify-content-center">
        <h1>Meme Server 2.0</h1>
    </nav>
    <main style="text-align: center; padding: auto; margin: auto; padding-top: 100px; width: 50%" class="">
        <h2 style="padding-bottom: 40px;">Hello, Here's a meme for you!</h2>
        <img src="/static/images/<%=memeName%>" alt="Meme" style="max-width: 400px; padding-bottom: 20px;">
        <form action="/memes.jsp" method="POST">
            <button type="submit" class="btn btn-success btn-block" name="memeid" value="">Next Meme</button>
        </form>
    </main>
</body>
</html>