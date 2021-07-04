<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Kangshitao
  Date: 2021年7月2日
  Time: 下午5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改数据页面</title>
    <%--使用BootStrap美化界面，使用CDN加速--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<!-- 使用BootStrap框架美化页面 -->
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post" >
        <%-- 设置一个隐藏域，用于传递id,用于更新内容 --%>
        <input type="hidden" name="bookID" value="${bookToUpdate.bookID}">
        
        <div class="form-group">
            <label for="bookname">书籍名称</label>
            <input type="text" class="form-control" id="bookname" name="bookName" value="${bookToUpdate.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookcount">书籍数量</label>
            <input type="text" class="form-control" id="bookcount" name="bookCounts" value="${bookToUpdate.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="bookdetail">书籍描述</label>
            <input type="text" class="form-control" id="bookdetail" name="detail" value="${bookToUpdate.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="确认修改">
        </div>

    </form>

</div>



</body>
</html>
