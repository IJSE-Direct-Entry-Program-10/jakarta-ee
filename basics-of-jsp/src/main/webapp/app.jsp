<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/header.jsp" %>
<main>
    <%
        String main = request.getParameter("page");
        if (main == null || main.isBlank()) main = "home";
        switch (main) {
            case "page-1":
                main = "page1.jsp";
                break;
            case "page-2":
                main = "page2.jsp";
                break;
            case "home":
                main = "home.jsp";
                break;
            default:
                main = "404.jsp";
        }
        main = "/WEB-INF/" + main;
    %>
    <jsp:include page="<%=main%>"></jsp:include>
</main>
<%@ include file="/WEB-INF/footer.jsp" %>