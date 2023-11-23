<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学员注册页面</title>
</head>
<body>
<h1 align="center">学员注册页面</h1>
<%--@elvariable id="user" type="com.github.qiu121.entity.User"--%>
<form:form action="${pageContext.request.contextPath}/user/register" modelAttribute="user" method="POST">
    <table border="1" width="50%" align="center">
        <tr>
            <td align="right">请输入学号：</td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td align="right">请输入学员姓名：</td>
            <td><form:input path="name"/></td>
        </tr>

        <tr>
            <td align="right">请输入年龄：</td>
            <td><form:input path="age"/></td>
        </tr>

        <tr>
            <td align="right">请输入性别：</td>
            <td>
                <form:radiobuttons path="sex" items="${genderMap}" delimiter="&nbsp;&nbsp;&nbsp;"/>
            </td>
        </tr>

        <tr>
            <td align="right">请输入密码：</td>
            <td><form:input path="pwd" type="password"/></td>
        </tr>
        <tr>
            <td align="right">请输入科目：</td>
            <td><form:input path="subject"/></td>
        </tr>
        <tr>
            <td align="right"></td>
            <td colspan="2" align="left"><input type="submit" value="注册"></td>
        </tr>

    </table>
</form:form>
</body>
</html>