<%-- Directives (Some guidelines for our servlet engine [Web Container])
    1. page: to provide some information regarding current jsp page such as,
       what the page imports are, what the content type/encoding of the page is, etc.
    2. include: to embed/include some content from jsp, html, etc.
    3. taglib: To point out the tag library
 --%>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Basics of JSP</title>
</head>
<body>
    <h1>Basics of Jakarta Server Pages (JSP)</h1>
    <%-- Expressions --%>

    <% out.println(10+15); %>
    <h4>10+15=<%= 10+15 %></h4>
    <%! int x; %>
    <%
        /* This is a scriptlet */
        System.out.println(Math.random());
        new ArrayList<>();
        x++;

        /* There are few implicit objects that we can use inside a scriptlet
        *       application = getServletContext()
        *       request = HttpServletRequest
        *       response = HttpServletResponse
        *       out = response.getWriter()
        *       config = getServletConfig()
        * */

        response.getWriter().println("<h2>Response.getWriter().println()</h2>");
        out.println("<h2>out.println()</h2>");
    %>
    <h2>Request Count: <%= x %></h2>
    <%!
        /* This is a declaration */
        {
            System.out.println("This is going to print only once");
        }


    %>
</body>
</html>


