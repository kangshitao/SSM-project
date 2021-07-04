<%--
  Created by IntelliJ IDEA.
  User: Kangshitao
  Date: 2021年7月2日
  Time: 下午2:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      h3{
        width: 180px;
        height: 38px;
        margin:100px auto;
        text-align: center;
        line-height: 38px;
        background: deepskyblue;
        border-radius: 10px;
      }
      a{
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍展示页面</a>
  </h3>
  </body>
</html>
