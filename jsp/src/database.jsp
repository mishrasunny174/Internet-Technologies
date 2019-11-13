<%@ page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<sql:setDataSource var="database" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://database/jsp" user="root"
    password="root" />

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Database Connection</title>
</head>

<body>
    <main style="width: 50%; padding: auto; margin: auto;">
        <sql:query dataSource="${database}" var="result">
            select * from users;
        </sql:query>
        <table border="1" width="100%">
            <tr>
                <th>Username</th>
                <th>Password</th>
            </tr>

            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td>
                        <c:out value="${row.username}" />
                    </td>
                    <td>
                        <c:out value="${row.password}" />
                    </td>
                </tr>
            </c:forEach>
        </table>
    </main>
</body>

</html>