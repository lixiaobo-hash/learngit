<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/css/misc-pages.css">

<title>登录-员工OA系统</title>

</head>
<body class="simple-page">


<div class="simple-page-wrap">

	<div class="simple-page-logo ">
		<a href="">
			<span></span>
			<span>员工OA系统</span>
		</a>
	</div><!-- logo -->
	
	<div class="simple-page-form" id="login-form">
		<h4 class="form-title m-b-xl text-center">请输入用户名和密码</h4>
		<form action="${pageContext.request.contextPath }/LoginServlet" method="post">
			<div class="form-group">
				<input type="text" name="name" class="form-control" placeholder="用户名" value="">${login_message}
			</div>
		
			<div class="form-group">
				<input type="password" name="password" class="form-control" placeholder="密码">
			</div>
		
			<div class="form-group m-b-xl">
				<input name="flag" value="1" type="radio" id="keep_me_logged_in"  style="height:auto;margin:0 0 0 10px;" />
				<label for="admin_logged_in">系统管理员</label>
				<input name="flag" value="2" type="radio" id="keep_me_logged_in"  style="height:auto;margin:0 0 0 10px;" />
				<label for="manager_logged_in">主管</label>
				<input name="flag" value="3" type="radio" id="keep_me_logged_in"  style="height:auto;margin:0 0 0 10px;" />
				<label for="employee_logged_in">员工</label>
			</div>
			
			<input type="submit" class="btn btn-primary" value="登录">
		</form>
	</div>
	
	<div class="simple-page-footer">
		<p>
			<small>新员工 ?</small>
			<a href="">创建账号</a>
		</p>
	</div>


</div>

</body>
</html>