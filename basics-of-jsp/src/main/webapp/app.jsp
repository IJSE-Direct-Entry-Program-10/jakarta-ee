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
        }

        header > menu > li > a {
            text-decoration: none;
            color: black;
            padding: 10px;
            display: inline-block;
        }

        header > menu > li:hover {
            background-color: lightgray;
            border-radius: 10px;
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
    </style>
</head>
<body>
    <header>
        <h1>Welcome to JSP</h1>
        <menu>
            <li><a href="app.jsp">Home</a></li>
            <li><a href="page1.jsp">Page1</a></li>
            <li><a href="page2.jsp">Page2</a></li>
        </menu>
    </header>
    <main>
        <h2>This is home page</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores culpa facilis incidunt itaque natus nobis odio quis reiciendis suscipit tempora! Architecto consequatur dolor quae. Adipisci esse facilis illum repellendus sint?</p>
    </main>
    <footer>Copyright &copy; 2023 DEP-10. All Rights Reserved.</footer>
</body>
</html>