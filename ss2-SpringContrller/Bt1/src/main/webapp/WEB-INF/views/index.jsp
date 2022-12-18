<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/12/2022
  Time: 5:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="sandwich" method="post">
  <input type="checkbox" value="lettuce" name="lettuce"><span>Lettuce</span>
  <input type="checkbox" value="tomato" name="tomato"><span>Tomato</span>
  <input type="checkbox" value="mustard" name="mustard"><span>Mustard</span>
  <input type="checkbox" value="sprouts" name="sprouts"><span>Sprouts</span>
  <input type="submit" value="Save">
</form>
<h3>List</h3>
<p>${result}</p>
</body>
</html>
