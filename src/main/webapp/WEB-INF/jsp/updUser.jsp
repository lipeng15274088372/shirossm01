<%--
  Created by IntelliJ IDEA.
  User: My
  Date: 2021/12/8
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/shirossm01/user/goUpdate" method="post">
    <input type="hidden" name="userid" value="${u.userid}"/>
    用户名：<input type="text" name="username" value="${u.username}"/><br/>
    密码：<input type="text" name="password" value="${u.password}"/><br/>
    <input type="submit"/>
</body>
</html>
