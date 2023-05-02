<%--
  Created by IntelliJ IDEA.
  User: ranjith-suranga
  Date: 5/2/23
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Success Message</title>
  <link rel="stylesheet" href="css/reset.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,400;1,500;1,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="css/styles.css">
  <style>
      body {
        text-align: center;
      }

      h2 {
        font-weight: bold;
        font-size: 1.5rem;
        padding: 10px;
      }
  </style>
</head>
<body>
  <h2>Customer ID:<%= request.getParameter("id") %> has been saved successfully</h2>
  <p>Click to add a <a href="http://localhost:5000/save-customer.html">new customer</a></p>
</body>
</html>
