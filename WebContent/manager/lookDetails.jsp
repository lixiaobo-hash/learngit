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
    <div class="title">详细信息</div>
    <div class="content">
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>编号</th>
                <th>${user.username }</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            
            <tr>
                <td>密码</td>
                <td>${user.password }</td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>姓名</th>
                <th>${user.name }</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            
            <tr>
                <td>性别</td>
                <td>${user.sex }</td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>出生日期</th>
                <th>${user.birthday }</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            
            <tr>
                <td>学历</td>
                <td>${user.qualification }</td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>职位</th>
                <th>${user.position }</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            
            <tr>
                <td>入职时间</td>
                <td>${user.heir_date }</td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>所属角色</th>
                <th>员工</th>
            </tr>
            </thead>
        </table>
        <div style = "text-align:center"><a href="${pageContext.request.contextPath }/FindAllEmployeeServlet"><input type="button" value="返回"></a></div>
    </div>
</div>
</body>
</html>