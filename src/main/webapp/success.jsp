<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学员信息</title>
</head>
<body>
<h1 align="center">学员信息如下</h1>
<table border="1" width="60%" align="center">
    <tr>
        <th>学员学号</th>
        <th>学员姓名</th>
        <th>性别</th>
        <th>密码</th>
        <th>科目</th>
    </tr>

    <tr align="center">
        <td>${user.id }</td>
        <td>${user.name }</td>
        <td>${user.sex == 0 ? "男":"女" }</td>
        <td>*************</td>
        <td>${user.subject }</td>
    </tr>
</table>
</body>
</html>