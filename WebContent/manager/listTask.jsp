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
    <div class="title">全部任务</div>
    <div class="content">
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>任务名称</th>
                <th>实施人</th>
                <th>开始时间</th>
                <th>结束时间</th>
                <th>任务状态</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <c:forEach items="${taskList }" var="task">
            <tr>
                <td>${task.task_name }</td>
                <td>${task.staff_id }</td>
                <td>${task.task_begin_time }</td>
                <td>${task.task_end_time }</td>
                <td>${task.task_state }</td>
                <td>
                    <a href="${pageContext.request.contextPath }/FindTaskByIdServlet?id=${task.id}&task_id=${task.id}" class="del">详细信息</a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>