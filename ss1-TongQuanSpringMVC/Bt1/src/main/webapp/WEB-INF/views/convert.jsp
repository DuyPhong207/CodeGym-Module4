<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/12/2022
  Time: 4:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/convert">
  <span>USD :</span>
  <input type="text" name="usd">
  <span>VND :</span>
  <input type="text" name="vnd" value="${vnd}">
  <input type="submit" value="Convert">
</form>
</body>
</html>
