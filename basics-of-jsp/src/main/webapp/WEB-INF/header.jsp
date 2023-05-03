<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>My Page Title</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            paddidng: 0;
        }

        body {
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            font-family: Ubuntu, sans-serif;
        }

        header {
            height: 100px;
            flex-shrink: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            row-gap: 5px;
            border-bottom: 1px solid lightgray;
        }

        header > menu {
            list-style-type: none;
            display: flex;
            gap: 5px;
        }

        header > menu > li > a {
            text-decoration: none;
            color: black;
            padding: 10px;
            display: inline-block;
            border-radius: 10px;
        }

        header > menu > li:hover a{
            background-color: lightgray;
        }

        main {
            flex-grow: 1;
            padding: 10px;
            text-align: center;
        }

        footer {
            height: 60px;
            flex-shrink: 0;
            border-top: 1px solid lightgray;
            display: flex;
            justify-content: center;
            align-items: center;
            font-weight: bold;
        }

        .selected {
            background-color: skyblue;
        }
    </style>
</head>
<body>
<header>
    <h1>Welcome to JSP</h1>
    <menu>
        <%
            String p = request.getParameter("page");
            if (p == null || p.isBlank()) p = "home";
        %>
        <li><a class="<%= p.equalsIgnoreCase("home") ? "selected": "" %>" href="app.jsp">Home</a></li>
        <li><a class="<%= p.equalsIgnoreCase("page-1") ? "selected": "" %>" href="app.jsp?page=page-1">Page1</a></li>
        <li><a class="<%= p.equalsIgnoreCase("page-2") ? "selected": "" %>" href="app.jsp?page=page-2">Page2</a></li>
    </menu>
</header>

