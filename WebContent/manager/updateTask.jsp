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
    <form action="${pageContext.request.contextPath }/SubmitUpdateTaskMessageServlet" method="post">
        <table id="tb" class="table">
            <thead>
            <input type="hidden" name="id" value="${task.id }"/>
            <tr>
                <th>任务名称：</th>
                <th><input type="text" name="task_name" value="${task.task_name }"/></th>
                <th>任务描述：</th>
                <th><input type="text" name="task_description" value="${task.task_description }"/></th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td>开始时间：</td>
                <td><input type="date" name="task_begin_time" value="${task.task_begin_time}" style="width: 160px"/></td>
                <td>结束时间：</td>
                <td><input type="date" name="task_end_time" value="${task.task_end_time}" style="width: 160px"/></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>实施人：</th>
                <th><input type="text" name="staff_id" value="${task.staff_id }"/></th>
                <th>任务状态：</th>
                <th>
				<select name="task_state">
		         <option  value="实施中">实施中</option>
		         <option  value="未实施">未实施</option>
		         <option  value="已完成">已完成</option>
		    	</select>
				</th>
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
            </tr>
            </thead>
            <tbody id="show_tbody">
            <tr>
                <td>${plan.plan_name }</td>
                <td>${plan.plan_state }</td>
                <td>${plan.feedback }</td>
                <td>${plan.plan_begin_time }</td>
                <td>${plan.plan_end_time }</td>
            </tr>
            </tbody>
        </table>
        <div style = "text-align:center"><input type="submit" value="提交"></a></div>
        </form>
    </div>
</div>
</body>
</html>