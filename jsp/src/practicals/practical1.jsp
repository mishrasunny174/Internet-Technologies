<%@ page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Practical 1</title>
</head>
<body>
    <form action="practical1.jsp" method="post">
        <label for="number">N</label>
        <input type="text" name="number" id="number">
        <button type="submit" name="submit" value="submit">Submit</button>
    </form>
    <c:if test='${param.submit != null}'>
        <%
            int n = Integer.parseInt(request.getParameter("number"));
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=i; j++) {
                    out.write(j+" ");
                }
                out.write("<br>");
            }
        %>   
    </c:if>
</body>
</html>