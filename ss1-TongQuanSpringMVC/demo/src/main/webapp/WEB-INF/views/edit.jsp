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
    <title>Edit Product</title>
</head>
<body>
<center>
    <h1>Product Management</h1>
    <h2>
        <a href="/product/list">List All Products</a>
    </h2>
</center>
<div align="center">
    <form action="/product/edit" method="post">
        <input type="hidden" name = "action" value="edit">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Product
                </h2>
            </caption>

            <tr>
                <th>Product ID:</th>
                <td>
                    <input type="text" name="id" value="${productId}"/>
                </td>
            </tr>
            <tr>
                <th>Product Name:</th>
                <td>
                    <input type="text" name="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Price:</th>
                <td>
                    <input type="text" name="price" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Manufacture:</th>
                <td>
                    <input type="text" name="manufacture" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Description:</th>
                <td>
                    <input type="text" name="desc" size="15"/>
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
