<%--
  Created by IntelliJ IDEA.
  User: My
  Date: 2021/12/8
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑</title>
</head>
<body>
<form action="/shirossm01/user/doEdit" method="post">
    <input type="hidden" name="userid" />
    用户名：<input type="text" name="username" /><br/>
    密码：<input type="text" name="password" /><br/>
    <input type="submit"/>
</form>
</body>
</html>
