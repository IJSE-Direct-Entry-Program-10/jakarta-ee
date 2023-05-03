<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>
<main>
    <%
        String main = request.getParameter("page");
        if (main == null || main.isBlank()) main = "home.jsp";
        switch (main){
            case "page-1":
                main = "page1.jsp";
                break;
            case "page-2":
                main = "page2.jsp";
                break;
            default:
                main = "home.jsp";
        }
    %>
    <jsp:include page="<%= main %>"></jsp:include>
</main>
<%@ include file="footer.jsp"%>