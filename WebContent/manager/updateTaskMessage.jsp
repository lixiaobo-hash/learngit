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
    <div class="title">调整任务信息</div>
    <div class="content">
    <form action="${pageContext.request.contextPath }/SubmitUpdateTaskMessageServlet" method="post">
        <table id="tb" class="table">
            <thead>
            <input type="hidden" name="id" value="${task.id }"/>
            <tr>
                <th>任务名:</th>
                <th><input type="text" name="task_name" value="${task.task_name}"/></th>
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
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>实施人</th>
                <th>
                <select name="staff_id">
		         <option  value="1">1</option>
		         <option  value="2">2</option>
		         <option  value="3">3</option>
		    	</select>
		    	</th>
		    	<th></th>
		    	<th></th>
            </tr>
            </thead>
             <tbody id="show_tbody">
            <tr>
                <td>任务描述：</td>
                <td><textarea name="task_description" clos=",50" rows="5" warp="virtual" placeholder="工作经历" value="task_description"></textarea></td>
                <td></td>
                <td></td>
            </tr>
            </tbody>
             <thead>
            <tr>
                <th>任务状态</th>
                <th>${task.task_state}
		    	</th>
		    	<th></th>
		    	<th></th>
            </tr>
            </thead>
        </table>
        <div style = "text-align:center"><input type="submit" value="提交"></a></div>
        </form>
    </div>
</div>
</body>
</html>