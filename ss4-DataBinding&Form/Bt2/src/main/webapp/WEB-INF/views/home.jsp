<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/12/2022
  Time: 6:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <h1>
        Tờ khai y tế
      </h1>
      <h2>đây là tài liệu quan trọng, thông tin của anh/chị sẽ giúp cơ quan y tế liên lạc khi cần thiết để
        phòng chống dịch bệnh truyền nhiễm
      </h2>
      <h4>
        Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự
      </h4>
      <form:form>
            <p>Họ tên (ghi chữ IN HOA) <span>(*)</span></p>
            <form:input path="hoTen"></form:input>
            <span>
                <p>Năm sinh <span>(*)</span></p>
                <form:select path="namSinh" items="">

                </form:select>
            </span>
      </form:form>
</body>
</html>
