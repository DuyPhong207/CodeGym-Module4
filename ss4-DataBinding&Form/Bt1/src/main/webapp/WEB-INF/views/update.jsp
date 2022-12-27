<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/12/2022
  Time: 8:00 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Setting</title>
</head>
<body>
    <h1>Setting</h1>
    <form:form action="/setting/update" method="post" modelAttribute="configuration">
        <h4>Language</h4>
        <form:select path="language">
            <form:option value="English">English</form:option>
            <form:option value="Vietnamese">Vietnamese</form:option>
            <form:option value="Japanese">Japanese</form:option>
            <form:option value="Chinese">Chinese</form:option>
        </form:select>
        <h4>Page size</h4>
        <p>Show
            <form:select path="pageSize">
                <form:option value="5">5</form:option>
                <form:option value="10">10</form:option>
                <form:option value="15">15</form:option>
                <form:option value="20">20</form:option>
                <form:option value="25">25</form:option>
            </form:select>
            emails per page
        </p>
        <h4>Spams filter</h4>
        <form:checkbox path="spamsFilter" value="false"/>Enable spams filter
        <h4>Signature</h4>
        <form:textarea path="signature"/>
        <br>
        <input type="submit" value="Update">
        <input type="reset" value="Cancel">
    </form:form>
</body>
</html>
