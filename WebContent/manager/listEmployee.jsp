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
                <th>姓名</th>
                <th>性别</th>
                <th>入职时间</th>
                <th>职位</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <c:forEach items="${employeeList }" var="employee">
            <tr>
                <td>${employee.name }</td>
                <td>${employee.sex }</td>
                <td>${employee.heir_date }</td>
                <td>${employee.position }</td>
                <td>
                    <a href="${pageContext.request.contextPath }/LookDetailsServlet?username=${employee.username}" class="del">详细信息</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>