<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/12/2022
  Time: 4:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/search">
  <input name="english" placeholder="Search" type="text">
  <input type="submit" value="Search">
</form>

<p>Result: </p><span>${result}</span>
</body>
</html>
