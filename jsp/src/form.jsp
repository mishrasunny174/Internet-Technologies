<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
    <nav class="nav justify-content-center">
        <h1>Form Processing Chapter 8</h1>
    </nav>
    <main style="width: 50%; margin: auto; padding: auto;">
        <form action="form.jsp" method="POST" style="margin-top: 10px;">
            <c:if test="${param.submit.equals('submit')}">
                <div class="form-group">
                    <textarea name="result" id="result" cols="50" rows="10" class="form-control" readonly>
                <c:out value="### You Entered ###" />
                <c:out value="Username: ${param['username']}" />
                <c:out value="Email: ${param['email']}" />
                <c:out value="DOB: ${param.date}" />
                <c:out value="Gender: ${param.gender}" />
                <c:out value="Favorite food: " />
                <c:forEach items="${paramValues.food}" var="current"><c:out value="${current}" /> </c:forEach>
                </textarea>
                </div>
            </c:if>
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" class="form-control" name="username" required>
            </div>
            <div class="form-group">
                <label for="date">Date of Birth</label>
                <input type="date" name="date" id="date" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" name="email" id="email" class="form-control" required>
            </div>
            <div class="form-group">
                <label>Gender</label>
                <div class="radio">
                    <label><input type="radio" name="gender" id="gender" value="male"> Male</label>
                </div>
                <div class="radio">
                    <label><input type="radio" name="gender" id="gender" value="female"> Female</label>
                </div>
            </div>
            <div class="form-group">
                <label>Favorite Food?</label>
                <div class="checkbox">
                    <label><input type="checkbox" name="food" id="food" value='pizza'> Pizza</label>
                </div>
                <div class="checkbox">
                    <label><input type="checkbox" name="food" id="food" value='pasta'> Pasta</label>
                </div>
                <div class="checkbox">
                    <label><input type="checkbox" name="food" id="food" value='chinese'> Chinese</label>
                </div>
            </div>
            <button type="submit" class="btn btn-primary btn-block" name='submit' value="submit">
                Submit
            </button>
        </form>
    </main>
</body>

</html>