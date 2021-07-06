<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" >

<head>
<meta charset="UTF-8">
<title>主管</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<nav>
	<div class="menu-btn">
		<div class="line line--1"></div>
		<div class="line line--2"></div>
		<div class="line line--3"></div>
	</div>

	<div class="nav-links">
		<a href="" class="link">添加员工</a>
		<a href="${pageContext.request.contextPath }/FindAllEmployeeServlet" class="link">查询员工</a>
		<a href="" class="link">分配员工</a>
	</div>
</nav>
<div class="inform">
	Sliding Menu
</div>
<script  src="/js/index.js"></script>
</body>
</html>

