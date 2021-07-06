<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/css/misc-pages.css">

<title>添加员工</title>

</head>
<body class="simple-page">


<div class="simple-page-wrap">

	<div class="simple-page-logo ">
		<a href="">
			<span></span>
			<span>添加员工</span>
		</a>
	</div><!-- logo -->
	
	<div class="simple-page-form" id="login-form">
		<h4 class="form-title m-b-xl text-center">请输入员工信息</h4>
		<form action="${pageContext.request.contextPath }/AddUserServlet" method="post">
			<div class="form-group">
				<input type="text" name="name" class="form-control" placeholder="姓名" >
			</div>
		
			<div class="form-group">
				<input type="password" name="password" class="form-control" placeholder="密码" >
			</div>
		
			<div class="form-group m-b-xl">
				<input name="sex" value="男" type="radio" id="keep_me_logged_in"  style="height:auto;margin:0 0 0 10px;" />
				<label for="admin_logged_in">男</label>
				<input name="sex" value="女" type="radio" id="keep_me_logged_in"  style="height:auto;margin:0 0 0 10px;" />
				<label for="manager_logged_in">女</label>
			</div>
			<div class="form-group">
				<input type="date" name="birthday" class="form-control" placeholder="出生日期">
			</div>
			<div class="form-group">
				<input type="date" name="heir_date" class="form-control" placeholder="入职时间">
			</div>
			<div class="form-group">
				<input type="text" name="position" class="form-control" placeholder="职位">
			</div>
			<div class="form-group">
			<select name="qualification">
		         <option  value="本科">本科</option>
		         <option  value="大专">大专</option>
		         <option  value="硕士及以上">硕士及以上</option>
		         <option  value="大学以下">大学以下</option>
		    </select>
		    </div>
		    <div class="form-group">
				<input type="text" name="professional" class="form-control" placeholder="专业" >
			</div>
		    <div class="form-group">
				<textarea name="experience" clos=",50" rows="5" warp="virtual" placeholder="工作经历"></textarea>
			</div>
			<div class="form-group">
			<select name="flag">
		         <option  value="1">1</option>
		         <option  value="2">2</option>
		         <option  value="3">3</option>
		    </select>
		    </div>
			<input type="submit" class="btn btn-primary" value="提交">
			<input type="reset" class="btn btn-primary" value="重置">
		</form>
	</div>


</div>

</body>
</html>