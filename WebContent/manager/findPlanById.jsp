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
    <div class="title">计划详细信息</div>
    <div class="content">
    
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>计划名称：</th>
                <th>${plan.plan_name }</th>
                <th>计划描述：</th>
                <th>${plan.plan_description }</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td>开始时间：</td>
                <td>${plan.plan_begin_time }</td>
                <td>结束时间：</td>
                <td>${plan.plan_end_time }</td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>所属任务：</th>
                <th>${task.task_name }</th>
                <th>计划状态：</th>
                <th>${plan.plan_state }</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td>反馈信息：</td>
                <td>${plan.feedback }</td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>