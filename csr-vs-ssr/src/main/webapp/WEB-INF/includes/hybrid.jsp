<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Hybrid</title>
  <script defer src="js/my-script.js"></script>
  <link rel="stylesheet" href="css/styles.css">
</head>
<body>
  <h1>Hybrid - AKA ReHydration</h1>
  <%-- CSR --%>
  <ol id="my-list"></ol>
  <%-- SSR --%>
  <ol>
    <%
      for(String str: new String[]{"First", "Second", "Third", "Fourth", "Fifth"}){
    %>
    <li><%= str %></li>
    <%
      }
    %>
  </ol>
</body>
</html>