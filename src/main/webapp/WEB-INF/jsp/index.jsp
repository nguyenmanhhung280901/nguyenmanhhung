<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
    <link href="/css/style.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <h2 style="text-align: center;">Employee Management</h2>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Wage</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employees}" var="e">
            <tr>
                <th scope="row">${e.id}</th>
                <td>${e.name}</td>
                <td>${e.wage}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="row">
        <div class="col-6">
            <form method="post" action="create">
                <div class="mb-3">
                    <label for="name" class="form-label">Name:</label>
                    <input type="text" class="form-control" name="name" id="name">
                </div>
                <div class="mb-3">
                    <label for="wage" class="form-label">Wage:</label>
                    <input type="text" class="form-control" name="wage" id="wage">
                </div>
                <button type="submit" class="btn btn-success">Create</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>