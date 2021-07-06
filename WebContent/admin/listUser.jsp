<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>全部员工</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="/css/listStyle.css"/>
	
    <link rel="stylesheet" type="text/css" href="/css/listBootstrap.css"/>
</head>
<body>
<div class="box">
    <div class="title">全部员工</div>
    <div class="content">
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>用户名</th>
                <th>姓名</th>
                <th>密码</th>
                <th>性别</th>
                <th>出生日期</th>
                <th>入职时间</th>
                <th>职位</th>
                <th>学历</th>
                <th>专业</th>
                <th>经历</th>
                <th>身份标志</th>
                <th>上级编号</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <c:forEach items="${userList }" var="user">
            <tr>
                <td>${user.username }</td>
                <td>${user.name }</td>
                <td>${user.password }</td>
                <td>${user.sex }</td>
                <td>${user.birthday }</td>
                <td>${user.heir_date }</td>
                <td>${user.position }</td>
                <td>${user.qualification }</td>
                <td>${user.professional }</td>
                <td>${user.experience }</td>
                <td>${user.flag }</td>
                <td>${user.super_id }</td>
                <td>
                    <a href="${pageContext.request.contextPath }/DeleteUserServlet?username=${user.username}" class="del">删除</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>