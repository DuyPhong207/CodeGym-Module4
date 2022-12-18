<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/12/2022
  Time: 11:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create New Product</title>
</head>
<body>
<center>
    <h2>
        <a href="/product/list">List All Product</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Add New Product</h2>
            </caption>
            <tr>
                <th>Product Code:</th>
                <td>
                    <input type="text" name="id" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Product name:</th>
                <td>
                    <input type="text" name="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Price:</th>
                <td>
                    <input type="text" name="price"/>
                </td>
            </tr>
            <tr>
                <th>Manufacture:</th>
                <td>
                    <input type="text" name="manufacture" size="100"/>
                </td>
            </tr>
            <tr>
                <th>Description:</th>
                <td>
                    <input type="text" name="desc" size="100"/>
                </td>
            </tr>
            <tr>
                <th>Category:</th>
                <td>
                    <select name="categoryId">
                        <c:forEach items="${categoryList}" var="category">
                            <option value="${category.id}">${category.name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
