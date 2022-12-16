<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/12/2022
  Time: 11:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<div id="header">
    <div class="header-logo">

    </div>

    <div class="header-name">
        <h3>Trinh Duy Phong</h3>
    </div>
</div>

<div id="nav">
    <ul id="menu">
        <li><a href="">Home</a></li>
        <li><a href="/product/list">Product</a></li>
        <li><a href="">Category</a></li>
    </ul>
    <div class="nav-search">
        <form action="/product" method="get">
            <input class="search-input" type="text" name="search" placeholder="Search">
            <input class="search-submit" type="submit" value="Search">
            <input name="action" type="hidden" value="search">
        </form>
    </div>
</div>
<div class="create-product">
    <a href="/product/create">Add New Product</a>
</div>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Products</h2></caption>
        <tr>
            <th>Product Id</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Manufacture</th>
            <th>Description</th>
            <th>Category</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td><c:out value="${product.getId()}"/></td>
                <td><c:out value="${product.getName()}"/></td>
                <td><c:out value="${product.getPrice()}"/></td>
                <td><c:out value="${product.getManufacture()}"/></td>
                <td><c:out value="${product.getDesc()}"/></td>
                <td><c:out value="${product.getCategory().getName()}"/></td>
                <td>
                    <a class="action-btn" href="/product/edit?id=${product.getId()}">Edit</a>
                    <a class="action-btn" href="/product/delete?id=${product.getId()}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
<style>
    * {
        padding: 0;
        margin: 0;
        box-sizing: border-box;
    }

    html {
        font-family: Arial, Helvetica, sans-serif;
    }

    #header {
        width: 100%;
        height: 100px;
    }

    #header div {
        display: inline-block;
    }

    #header .header-logo {
        height: 100px;
        width: 124px;
        background: url(https://zoukclub.com/wp-content/uploads/2019/11/Furama-Riverfront-Logo.png) top center / cover no-repeat;
        margin-left: 24px;
    }

    #header .header-name {
        float: right;
    }

    #header .header-name h3 {
        line-height: 100px;
        padding: 0 24px;
    }

    #nav {
        width: 100%;
        height: 56px;
        background-color: black;
    }

    #menu {
        display: inline-block;
    }

    #menu li {
        display: inline-block;
    }

    #menu li a {
        display: block;
        color: #fff;
        text-decoration: none;
        line-height: 56px;
        padding: 0 24px;
        text-transform: uppercase;
    }

    #menu li:hover a {
        background-color: #ccc;
        color: #000;
    }

    #nav .nav-search {
        float: right;
        margin: 12px 8px;
    }

    #nav .search-input {
        height: 32px;
        border-radius: 16px;
        width: 250px;
        padding: 4px 8px;
        font-size: 16px;
    }

    #nav .search-submit {
        height: 32px;
        width: 72px;
        text-transform: uppercase;
        cursor: pointer;
    }

    .create-product {
        height: 60px;
        width: 200px;
        background-color: #ccc;
        margin: 16px 8px;
    }

    .create-product a {
        width: 100%;
        font-size: 18px;
        text-decoration: none;
        text-transform: uppercase;
        line-height: 60px;
        display: inline-block;
        text-align: center;
        color: #000;
    }

    .create-product:hover a {
        background-color: #999;
        color: #ffffff;
    }

    .action-btn {
        text-decoration: none;
        color: #000;
        background-color: #ccc;
        padding: 4px 12px;
    }

    .action-btn:hover {
        color: #fff;
    }

    table {
        border-collapse: collapse;
        width: 1050px;
    }

    caption {
        margin-bottom: 24px;
    }

    th {
        height: 30px;
        width: 150px;
    }

    td {
        width: 150px;
        padding: 4px;
        text-align: right;
    }
</style>
</html>
