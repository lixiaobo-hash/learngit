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
    </style>
</head>
<% int id = Integer.parseInt(request.getParameter("id")); %>
<body>
<div class="box">
    <div class="title">制定计划</div>
    <div class="content">
    <form action="${pageContext.request.contextPath }/InsertPlanServlet" method="post">
        <table id="tb" class="table">
            <thead>
            <tr>
                <th>计划名称</th>
                <th><input type="text" name="plan_name" style="width: 160px;"></th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            
            <tr>
                <td>开始时间：<input type="date" name="plan_begin_time" style="width: 160px;"></td>
                <td>结束时间：<input type="date" name="plan_end_time" style="width: 160px;"></td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>是否反馈</th>
                <th><select name="feedback">
		         		<option  value="是">是</option>
		         		<option  value="否">否</option>
		    		</select>
		    	</th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            
            <tr>
                <td>计划描述：
                <textarea name="plan_description" clos=",50" rows="5" warp="virtual" ></textarea></td>
            </tr>
            </tbody>
            <thead>
            <tr>
                <th>任务状态</th>
                <th><select name="plan_state">
		         		<option  value="未实施">未实施</option>
		         		<option  value="实施中">实施中</option>
		         		<option  value="已完成">已完成</option>
		    		</select></th>
            </tr>
            </thead>
            <tbody id="show_tbody">
            
            <tr style="align-items: color:white">
                <td>
                
            	<input type="hidden" value="<%=id%>" name="task_id"/>
			<input type="submit" class="btn btn-primary" value="提交"></td>
                <td>
			<input type="reset" class="btn btn-primary" value="重置"></td>
            </tr>
            </tbody>
        </table>
        </form>
    </div>
</div>
</body>
</html>