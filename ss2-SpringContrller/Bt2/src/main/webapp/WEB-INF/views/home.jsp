<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/12/2022
  Time: 6:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form method="post" action="calculator">
    <input type="number" value="${num1}" name="number1">
    <input type="number" value="${num2}" name="number2">
    <select name="math">
        <option value="+">Addition(+)</option>
        <option value="-">Subtraction(-)</option>
        <option value="*">Multiplication(x)</option>
        <option value="/">Division(/)</option>
    </select>
    <input type="submit" value="Calculate">
</form>
<h2>Result: </h2><span>${result}</span>
</body>
</html>
