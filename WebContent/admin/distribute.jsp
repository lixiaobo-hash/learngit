<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>分配员工</title>
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="/css/listStyle.css"/>
	
    <link rel="stylesheet" type="text/css" href="/css/listBootstrap.css"/>
</head>
<body>
<div class="box">
    <div class="title">未分配员工信息</div>
    <div class="content">
    <form action="${pageContext.request.contextPath }/UpdateIdServlet" method="post">
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>用户ID</th>
                <th><input type="text" name="username" value="${user.username}"/></th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td>真实姓名</td>
                <td><input type="text" name="name" value="${user.name}"/></td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>主管</th>
                <th><input type="text" name="super_id" value="${user.super_id}"/></th>
            </tr>
            </thead>
        </table>
        <div style = "text-align:center"><input type="submit" value="提交"></a></div>
        </form>
    </div>
</div>
</body>
</html>