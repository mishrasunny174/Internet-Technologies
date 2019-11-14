<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Practical 5</title>
</head>

<body>
    <form action="practical5.jsp" method="post">
        <label for="word">Enter your word!</label>
        <input type="text" name="word" id="word">
        <br>
        <label><input type="radio" name="even_odd" id="even_odd" value="even"> Even</label>
        <label><input type="radio" name="even_odd" id="even_odd" value="odd"> Odd</label>
        <br>
        <button type="submit" value="submit" name="submit">Submit</button>
    </form>
    <c:if test="${param.submit != null}">
    <c:set var="win" value="${true}" scope="page"/>
        <c:choose>
            <c:when test="${param.even_odd.equals('even')}">
                <c:forEach items="${param.word.toCharArray()}" var="currentChar" step="2" begin="1">
                    <c:if test="${!fn:contains('aeiou',currentChar)}">
                        <c:set var="win" value="${false}"/>
                    </c:if>
                </c:forEach>
            </c:when>
            <c:when test="${param.even_odd.equals('odd')}">
                <c:forEach items="${param.word.toCharArray()}" var="currentChar" step="2" begin="0">
                    <c:if test="${!fn:contains('aeiou',currentChar)}">
                        <c:set var="win" value="${false}" scope="page"/>
                    </c:if>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <c:out value="Invalid Input"/>
            </c:otherwise>
        </c:choose>
        <c:if test="${win}">
            <c:out value="You Win"/>
        </c:if>
        <c:if test="${!win}">
            <c:out value="You Lose"/>
        </c:if>
    </c:if>
</body>

</html>