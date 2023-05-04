<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Actions</title>
</head>
<body>
    <h1>Actions</h1>
    <ul>
        <li>EL - Expression Language</li>
        <li>JSTL - Jakarta Standard Tag Library</li>
    </ul>

    <ul>
        <%
            for (String elm: new String[]{"First", "Second", "Third", "Fourth", "Fifth"} ) {
        %>
              <li><%= elm %></li>
        <%
            }
        %>
    </ul>

    <ul>
        <%-- [] : ArrayList, {}: HashSet --%>
        <c:forEach var="elm" items="${['First', 'Second', 'Third', 'Fourth', 'Fifth']}">
            <li>${elm}</li>
        </c:forEach>
    </ul>

    <%
        String query = request.getParameter("q");
        if (query != null){
    %>
        <h1><%= query %></h1>
    <%
        }
    %>

    <%--
        EL Operators
        eq  ==      (equal)
        ne  !=      (not equal)
        lt  5 < 7   (less than)
        gt  10 > 5  (greater than)
        le  <=      (less than or equal)
        ge  >=      (greater than or equal)

        and &&
        or  ||
    --%>

    <c:if test="${param['q'] ne null}">
        <h1>${param['q']}</h1>
    </c:if>

</body>
</html>