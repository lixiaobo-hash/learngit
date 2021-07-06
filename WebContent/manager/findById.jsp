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
    <div class="title">任务详细信息</div>
    <div class="content">
    
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>任务名称：</th>
                <th>${task.task_name }</th>
                <th>任务描述：</th>
                <th>${task.task_description }</th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td>开始时间：</td>
                <td>${task.task_begin_time }</td>
                <td>结束时间：</td>
                <td>${task.task_end_time }</td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>实施人：</th>
                <th>${task.staff_id }</th>
                <th>任务状态：</th>
                <th>${task.task_state }</th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td><h4>实施计划</h4></td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>计划名称</th>
                <th>完成状态</th>
                <th>是否反馈</th>
                <th>开始时间</th>
                <th>结束时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td>${plan.plan_name }</td>
                <td>${plan.plan_state }</td>
                <td>${plan.feedback }</td>
                <td>${plan.plan_begin_time }</td>
                <td>${plan.plan_end_time }</td>
                <td><a href="${pageContext.request.contextPath }/FindPlanByIdServlet?task_id=${task.id}" class="del">详细信息</a></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>